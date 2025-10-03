package Oops.Polymorphism.CompileTime;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(String name){
	System.out.println(name);
	}
	ConstructorOverloading(int id){
		System.out.println(id);
	}
	ConstructorOverloading(String name,int id){
		System.out.println("Name :"+ name+" id :"+id);
	}
	public ConstructorOverloading() {
		System.out.println("No arg constructor called");
	}
	public static void main(String[] args) {
		ConstructorOverloading obj= new ConstructorOverloading("Radha");
		
		ConstructorOverloading obj2= new ConstructorOverloading(7);
		ConstructorOverloading obj3= new ConstructorOverloading("Radha",10);
		ConstructorOverloading obj4= new ConstructorOverloading();
	}

}
