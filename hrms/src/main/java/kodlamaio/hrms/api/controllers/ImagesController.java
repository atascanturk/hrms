package kodlamaio.hrms.api.controllers;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.services.CloudinaryService;
import kodlamaio.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/cloudinary")
@CrossOrigin
public class ImagesController {

	
	CloudinaryService cloudinaryService;	
	ImageService imageService;
	
	@Autowired
	public ImagesController(CloudinaryService cloudinaryService, ImageService imageService) {
		super();
		this.cloudinaryService = cloudinaryService;
		this.imageService = imageService;
	}


	@GetMapping("getAll")
	public ResponseEntity<List<Image>> getAll(){
		
		List<Image> list  = this.imageService.getAll().getData();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload (@RequestParam MultipartFile multipartFile) throws IOException{
		
		BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
		if(bufferedImage == null) {
			
			return new ResponseEntity("Resim validasyonu başarısız.", HttpStatus.BAD_REQUEST);
		}			
		
		Map result = cloudinaryService.upload(multipartFile);
		Image image = new Image((String)result.get("original_filename"),(String)result.get("url"),
				(String)result.get("public_id"));
		
		this.imageService.add(image);
		
		
		return new ResponseEntity("Image saved.", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete (@PathVariable("id") int id) throws IOException{
		if (!this.imageService.isExists(id)) {
			return new ResponseEntity("Böyle bir resim bulunamadı",HttpStatus.NOT_FOUND);
		}
		
		Image image = this.imageService.getById(id).getData().get();
		Map result = cloudinaryService.delete(image.getImageId());
		this.imageService.delete(id);
		return new ResponseEntity("Resim başarıyla silindi.", HttpStatus.OK);
	}
	
	
}
