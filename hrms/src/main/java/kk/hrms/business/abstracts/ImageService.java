package kk.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.entities.concretes.Image;

public interface ImageService {
	
	Result upload (int id,MultipartFile file);
	DataResult<Image>getByJobhunter(int jobHunterId);
	DataResult<List<Image>> getAll();
	
}
