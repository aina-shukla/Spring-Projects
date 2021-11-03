package webapp;

public class UserValidationService {

	public boolean isUserValid(String uname, String password) {
		if (uname.equals("Aina") && password.equals("aina"))
			return true;
		else
			return false;
	}
}
