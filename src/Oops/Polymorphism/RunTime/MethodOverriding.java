package Oops.Polymorphism.RunTime;

public class MethodOverriding extends Parent {

	@Override
	public void message() {
	System.out.println("Child Method called");

	}
	public static void main(String[] args) {
		Parent obj= new MethodOverriding();
		obj.message();
		MethodOverriding obj2=(MethodOverriding)obj;
		obj2.message();
		Child2 obj3=new Child2();
		obj3.message();
	}

}

class Child2 extends Parent{
	
}
class Parent{
	
	void message() {
		System.out.println("Parent Method called");
	}
}
