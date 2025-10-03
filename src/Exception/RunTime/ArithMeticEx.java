package Exception.RunTime;

public class ArithMeticEx {

	public static void main(String[] args) {

		int a = 10;
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic exception handled");
		}
	}

}
