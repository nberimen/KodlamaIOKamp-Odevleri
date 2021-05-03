package week3;

public class Instructor extends User {

	private String instructorNumber;
	private int salary;
	
	public Instructor() {
		
	}
	public Instructor(int id,int age, String firstName, String lastName, String userName, String email
			, String password, String instructorNumber, int salary) {
		super(id,age,firstName,lastName,userName,email,password);
		this.instructorNumber = instructorNumber;
		this.salary=salary;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
}
