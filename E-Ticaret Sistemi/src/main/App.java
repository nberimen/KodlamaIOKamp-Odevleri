package main;

import main.business.concretes.UserManager;
import main.core.abstracts.EmailCheckService;
import main.core.abstracts.UserCheckService;
import main.core.concretes.EmailCheckManager;
import main.core.concretes.UserCheckManager;
import main.dataAccess.abstracts.UserDao;
import main.dataAccess.concretes.HibernateUserDao;
import main.entities.concretes.User;

public class App {
	public static void main(String[] args) {

		User necati =new User("1", "Necati", "Berimen", "123456", "berimen66@gmail.com");
		User necati2 =new User("2", "Necati", "Berimen", "12341454544", "berimen66@gmail.com");
		User necati3 =new User("3", "N", "Berimen", "123456", "nberimen@gmail.com");
		User necati4 =new User("4", "Necati", "Berimen", "123", "nberimen.nb@gmail.com");
		
		UserDao userDao=new HibernateUserDao();
		
		EmailCheckService emailCheck = new EmailCheckManager();
		UserCheckService userCheck = new  UserCheckManager();
		
		UserManager userManager=new UserManager(userDao, emailCheck, userCheck);
		userManager.register(necati);
		userManager.login("berimen66@gmail.com","1234567");
		System.out.println("------------------------------------");
		userManager.login("berimen66@gmail.com","123456");
		System.out.println("------------------------------------");
		userManager.register(necati2);
		System.out.println("------------------------------------");
		userManager.register(necati3);
		System.out.println("------------------------------------");
		userManager.register(necati4);
	}
}
