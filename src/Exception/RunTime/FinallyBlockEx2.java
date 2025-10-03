package Exception.RunTime;

public class FinallyBlockEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0.0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled");
		} finally {
			System.out.println("finally blok ");
		}


	}

}
