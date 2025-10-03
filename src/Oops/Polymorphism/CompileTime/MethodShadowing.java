package Oops.Polymorphism.CompileTime;

public class MethodShadowing extends Parent {

	public static void greeting() {
		Parent.greeting();
		System.out.println("Good Morning");
	}

	public static void main(String[] args) {
		greeting();
	}
}

class Parent {
	public static void greeting() {
		System.out.println("Good Afternoor");
	}

}