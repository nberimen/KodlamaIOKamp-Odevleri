package main.business.concretes;

import java.util.List;

import main.business.abstracts.UserService;
import main.core.abstracts.EmailCheckService;
import main.core.abstracts.UserCheckService;
import main.dataAccess.abstracts.UserDao;
import main.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailCheckService emailCheck;
	private UserCheckService userCheck;

	public UserManager(UserDao userDao, EmailCheckService emailCheck, UserCheckService userCheck) {
		this.userDao = userDao;
		this.emailCheck = emailCheck;
		this.userCheck = userCheck;
	}

	@Override
	public void login(String email, String password) {
		if(userDao.getUserById(email)!=null) {
			User user=userDao.getUserById(email);
			if(user.getPassword().equals(password)) {
				System.out.println("Giris yapildi..");
			}else {
				System.out.println("Sifrenizi kontrol edin..");
			}
		}
		else {
			System.out.println("Gecersiz e-posta..");
		}
	}

	@Override
	public void register(User user) {

		if (userDao.getUserById(user.getEmail()) != null) {
			System.out.println("Bu email adresi kullaniliyor");
			return;
		}

		if (!emailCheck.isValid(user.getEmail())) {
			System.out.println("Geçersiz email");

		} else if (userCheck.checkName(user.getFirstName(), user.getLastName())
				&& userCheck.checkPassword(user.getPassword())) {
			if (userCheck.checkVerify()) {
				userDao.save(user);
			} else {
				System.out.println("E-posta adresinizi dogrulayin..");
			}
		}

	}

	@Override
	public void remove(User user) {
		// TODO Auto-generated method stub
		userDao.remove(user);
	}

	@Override
	public List<User> getUsers() {
		
		return null;
	}

	@Override
	public void deleteUserById(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
