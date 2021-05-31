package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Image;


public interface ImageService {

	DataResult<List<Image>> getAll();
	Result add(Image image);
	Result delete(int id);
	DataResult<Optional<Image>> getById(int id);
	Boolean isExists(int id);
	
	
}
