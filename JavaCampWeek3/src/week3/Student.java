package week3;

public class Student extends User{
	private String studentNumber;
	
	public Student() {
		
	}

	public Student(int id,int age, String firstName, String lastName, String userName, String email, String password,String studentNumber) {
		super(id,age,firstName,lastName,userName,email,password);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	} 
}
