package week3;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getUserName() +" Ogrenci Eklendi..");
	}
	
	@Override
	public void remove(User user) {
		System.out.println(user.getUserName() +" Ogrenci Silindi..");
	}

	public void dersler() {
		System.out.println("Alinan dersler..");
	}

}
