package week3;

public class Main {
	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1,35,"Ali","Veli","aliveli","ali@veli.com","12345","1",10000);
		
		Student student1 = new Student(12,22,"Ahmet","Mehmet","ahmetMehmet","ahmet@mehmet.com","654321","1");
		
		StudentManager studentManager1 = new StudentManager();
		InstructorManager instructorManager1 = new InstructorManager();
		
		
		studentManager1.add(student1);
		instructorManager1.add(instructor1);
		
		
		
	}

}
