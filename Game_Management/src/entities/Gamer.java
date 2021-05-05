package entities;

import java.time.LocalDate;

public class Gamer extends User {

	public Gamer() {
		super();
	}
	public Gamer(int id, String firstName, String lastName,LocalDate dateOfBirth, String nationalityId, String email) {
		super(id, firstName, lastName,dateOfBirth, nationalityId, email);
	}

	
}
