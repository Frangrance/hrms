package kk.hrms.core.utilities.uploads;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kk.hrms.core.utilities.results.DataResult;

public interface ImageUploadService {

	DataResult<Map> upload(MultipartFile file);
}
