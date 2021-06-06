package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.LinkService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.LinkDao;
import kk.hrms.entities.concretes.Link;

@Service
public class LinkManager implements LinkService {

private LinkDao linkDao;
	
	@Autowired
	public LinkManager(LinkDao linkDao) {
		super();
		this.linkDao = linkDao;
	}
	
	@Override
	public Result add(Link link) {
		this.linkDao.save(link);
		return new SuccessResult("link added!");
	}

	@Override
	public DataResult<List<Link>> getAll() {
		return new SuccessDataResult<List<Link>>(this.linkDao.findAll(),"Links listed");
	}

	@Override
	public DataResult<List<Link>> getByJobhunter(int jobHunterId) {
		return new SuccessDataResult<List<Link>>(this.linkDao.getByJobhunter_userId(jobHunterId));
	}

}
