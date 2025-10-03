package Oops.Inheritance.Is_A_Relationship;

public class Driver {

	public static void main(String[] args) {
		
		//Single Level
		Child obj4= new Child();
		System.out.println(obj4.name);
		
		//hierarchical 
		Child obj= new Child();
		System.out.println(obj.name);
		Child2 obj2= new Child2();
		System.out.println(obj2.name);
		
		//Multilevel
		SubChild obj3= new SubChild();
		System.out.println(obj3.name);
		System.out.println(obj3.childName);

	}

}
