package kk.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kk.hrms.business.abstracts.JobAdvertisementService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.entities.concretes.JobAdvertisement;
import kk.hrms.entities.dto.AdvertisementDto;

@RestController
@RequestMapping("/api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementsController {

	private JobAdvertisementService advertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService advertisementService) {
		super();
		this.advertisementService = advertisementService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.advertisementService.getAll();
	}

	@GetMapping("/getallbydate")
	public DataResult<List<JobAdvertisement>> getAllByDate() {
		return this.advertisementService.getAllSortedByDate();
	}

	@GetMapping("/getallbyactive")
	public DataResult<List<AdvertisementDto>> getAllByActive() {
		return this.advertisementService.getAllByActive();
	}

	@PostMapping("/add")
	public void add(@RequestBody JobAdvertisement advertisement) {
		this.advertisementService.add(advertisement);
	}

	@PostMapping("/update")
	public void update(@RequestBody JobAdvertisement advertisement) {
		this.advertisementService.update(advertisement);
	}

	@GetMapping("/getalldetail")
	public DataResult<List<AdvertisementDto>> getAllDetail() {
		return this.advertisementService.getAllDetail();
	}

}
