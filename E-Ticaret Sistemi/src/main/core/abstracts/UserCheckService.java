package main.core.abstracts;

public interface UserCheckService {
	boolean checkName(String firstName,String lastName);
	boolean checkPassword(String password);
	boolean checkVerify();

}
