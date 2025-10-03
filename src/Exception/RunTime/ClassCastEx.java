package Exception.RunTime;

public class ClassCastEx {

	public static void main(String[] args) {
		try {
			Parent p = new Child2();
			Child obj = (Child) p;
		} catch (ClassCastException e) {
			System.out.println("ClassCastException handled");
		}
	}

}

class Parent {

}

class Child extends Parent {

}

class Child2 extends Parent {

}
