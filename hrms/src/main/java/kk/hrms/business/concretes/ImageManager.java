package kk.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kk.hrms.business.abstracts.ImageService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.core.utilities.uploads.ImageHelper;
import kk.hrms.core.utilities.uploads.ImageUploadService;
import kk.hrms.dataAccess.abstracts.ImageDao;
import kk.hrms.entities.concretes.Image;
import kk.hrms.entities.concretes.JobHunter;

@Service
public class ImageManager implements ImageService {

	private ImageDao imagedao;
	private ImageUploadService helper;

	@Autowired
	public ImageManager(ImageDao imagedao,ImageHelper helper) {
		super();
		this.imagedao = imagedao;
		this.helper=helper;
	}

	
	@Override
	public Result upload(int id,MultipartFile file) {
		
		@SuppressWarnings("unchecked")
		Map<String,String> hey=(Map<String,String>)this.helper.upload(file).getData();
		
		JobHunter hunter=new JobHunter();
		Image image =new Image();
		hunter.setUserId(id);
		image.setJobhunter(hunter);
		
		 image.setUrl(hey.get("url"));
		 image.setUpdateDate(LocalDate.now());
		
	
		this.imagedao.save(image);
		return new SuccessResult("resim yüklendi");
	}

	@Override
	public DataResult<List<Image>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Image>>(this.imagedao.findAll());
	}


	@Override
	public DataResult<Image> getByJobhunter(int jobHunterId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Image>(this.imagedao.getByJobhunter_userId(jobHunterId));
	}
}