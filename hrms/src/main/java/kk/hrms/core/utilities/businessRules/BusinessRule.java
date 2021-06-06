package kk.hrms.core.utilities.businessRules;

import kk.hrms.core.utilities.results.Result;

public class BusinessRule {
	
	public static Result Run(Result... results)
    {
		for (Result result : results) {
			 if (!result.isSuccess())
            {
                return result;
            }
		}      
        return null;
    }
	
}
