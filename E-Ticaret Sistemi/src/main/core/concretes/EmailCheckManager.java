package main.core.concretes;

import main.core.abstracts.EmailCheckService;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckManager implements EmailCheckService {

	@Override
	public boolean isValid(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		return Pattern.matches(regex, email);
		
		/*Pattern pattern = Pattern.compile(regex);
		*
		*Matcher matcher = pattern.matcher(email);
		*
		*return matcher.matches();
		*/
	}

}
