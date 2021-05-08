package main.core.concretes;

import main.core.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkName(String firstName, String lastName) {
		if (firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("FirstName ve LastName en az 2 karakterden olusmali");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Parola en az 6 karakter olmali");
			return false;
		}
		return true;

	}

	@Override
	public boolean checkVerify() {
		System.out.println("Doðrulama e-postasý gönderildi..");

		System.out.println("E-posta dogrulandi.");
		return true;
	}

	

}
