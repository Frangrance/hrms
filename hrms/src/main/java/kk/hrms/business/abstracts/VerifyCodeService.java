package kk.hrms.business.abstracts;

import kk.hrms.core.utilities.Result;

public interface VerifyCodeService {
	
	Result add (int UserId);
	String generateCode ();
	
}
