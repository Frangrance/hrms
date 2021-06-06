package kk.hrms.core.utilities.verification;

import org.springframework.stereotype.Service;

@Service
public class VerificationManager implements VerificationService {

	@Override
	public void verifyByCode(String code, String email) {

		System.out.println("Doğrulama kodu yollanmıştır."+code+""+email);

	}

	@Override
	public void verifyByEmployee(int userId) {
		
		System.out.println("Verify by employer :" + userId);
		
	}
}