package Exception.RunTime;

public class CustomizeException {

	public static void main(String[] args) {
		try {
			throw new User("Customize Exception");
		} catch (User u) {
			System.out.println("Customize Exception handled");
		}
	}

}

class User extends RuntimeException {
	User(String message) {
		super(message);
	}
}