package week3;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println(user.getUserName() +" Egitmen Eklendi..");
	}
	
	@Override
	public void remove(User user) {
		System.out.println(user.getUserName() +" Egitmen Silindi..");
	}
	
	
}
