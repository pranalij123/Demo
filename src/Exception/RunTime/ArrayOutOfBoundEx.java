package Exception.RunTime;

public class ArrayOutOfBoundEx {

	public static void main(String[] args) {
		int a[]= {2,4};
		try {
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException handled");
		}

	}

}
