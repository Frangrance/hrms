package kk.hrms.core.utilities.uploads;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.ErrorDataResult;
import kk.hrms.core.utilities.results.SuccessDataResult;

@Service
public class ImageHelper implements ImageUploadService {

	@Override
	public DataResult<Map> upload(MultipartFile file) {

		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "frangrance", "api_key",
				"488418277629925", "api_secret", "1SLpJPVt-ZZl50GMlpG4km2TTII"));

		try {
			Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(uploadResult);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>();
	}

}
