package kk.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kk.hrms.business.abstracts.AbilityService;
import kk.hrms.core.utilities.results.DataResult;
import kk.hrms.core.utilities.results.Result;
import kk.hrms.core.utilities.results.SuccessDataResult;
import kk.hrms.core.utilities.results.SuccessResult;
import kk.hrms.dataAccess.abstracts.AbilityDao;
import kk.hrms.entities.concretes.Ability;

@Service
public class AbilityManager implements AbilityService {

	private AbilityDao abilitydao;

	@Autowired
	public AbilityManager(AbilityDao abilitydao) {
		super();
		this.abilitydao = abilitydao;
	}

	@Override
	public Result add(Ability ability) {
		this.abilitydao.save(ability);
		return new SuccessResult("ability added");
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Ability>>(this.abilitydao.findAll(),"abilities listed");
	}

	

	@Override
	public DataResult<List<Ability>> getByJobhunter(int JobHunterId) {
		
		return new SuccessDataResult<List<Ability>>(this.abilitydao.getByJobhunter_userId(JobHunterId));
	}
}