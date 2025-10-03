package Oops.Abstraction;

public class Driver implements InterfaceEx {

	public static void main(String[] args) {
		InterfaceEx obj= new Driver();
		obj.m1();

	}

	@Override
	public void m1() {
		System.out.println("m1 called");
		
	}

}
