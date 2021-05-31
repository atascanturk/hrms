package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.hrms.entities.concretes.Image;

@Service
@Transactional
public class ImageManager implements ImageService {

	ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		
	return new SuccessDataResult<List<Image>>(this.imageDao.findByOrderById(),"Başarıyla listelendi");
	}

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public Result delete(int id) {
		this.imageDao.deleteById(id);
		return new SuccessResult("Başarıyla silindi");
	}

	@Override
	public DataResult<Optional<Image>> getById(int id) {
	return new SuccessDataResult<Optional<Image>>(this.imageDao.findById(id),"Verilen id'ye sahip ürün başarıyla getirildi."); 
	}

	@Override
	public Boolean isExists(int id) {
		
		return this.imageDao.existsById(id);
	}

}
