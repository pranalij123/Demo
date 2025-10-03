package Oops.Polymorphism.CompileTime;

public class VariableShadowing extends Parent1 {
 public static String name="World";
	public static void main(String[] args) {
		System.out.println(name);

	}

}

class Parent1{
	public static String name="Hello";
}
