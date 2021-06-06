package kk.hrms.core.utilities.businessRules;

import kk.hrms.core.utilities.results.Result;

public class BusinessRule {
	
	public static Result Run(Result... logics)
    {
		for (Result result : logics) {
			 if (!result.isSuccess())
            {
                return result;
            }
		}      
        return null;
    }
	
}
