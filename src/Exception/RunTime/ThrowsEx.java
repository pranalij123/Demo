package Exception.RunTime;

public class ThrowsEx {

	public static void main(String[] args) {
		System.out.println("main Start");
		m1();
		System.out.println("main end");
	}

	private static void m1() throws NullPointerException, ArithmeticException {
		String str = null;
		try {
			System.out.println(10 / 0);
			System.out.println(str.charAt(0));
		} finally {
			System.out.println("finally block executed");
		}

	}

}
