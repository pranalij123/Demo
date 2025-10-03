package Oops.Abstraction;

public  class AbsractClass extends Parent {
	public void add(int a,int b) {
		System.out.println(a+b);

	} 
public static void main(String[] args) {
	Parent obj= new AbsractClass();
	obj.add(10,20);
}
	
}


abstract class Parent{
	abstract void add(int a, int b);
}