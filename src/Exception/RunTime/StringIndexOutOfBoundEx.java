package Exception.RunTime;

public class StringIndexOutOfBoundEx {
public static void main(String[] args) {
	String str="hello";
	try {
		System.out.println(str.charAt(5));
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException handled");
	}
}
}
