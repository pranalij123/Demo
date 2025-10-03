package Exception.RunTime;

public class NullPointerExceEx {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.charAt(0));
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException handled");
		}
	}

}
