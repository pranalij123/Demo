package Exception.RunTime;

public class RTExce {

	public static void main(String[] args) {
		try {
			int n=10/0;
		}
		catch(RuntimeException e) {
			System.out.println("Runtime exception handled");
		}
	}

}
