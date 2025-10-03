package Oops.Polymorphism.CompileTime;

public class MethodOverloding {

	
	 public void add(int a,int b) {
		 System.out.println(a+b);
	 }
	 
	 private void add(int a, int b,int c) {
		 System.out.println(a+b+c);
	}
	 
	 private void add(int a, float b) {
		
		 System.out.println(a+b);
	}
	 private void add(float a, int b) {
		 System.out.println(a+b);

	}
	public static void main(String[] args) {
		MethodOverloding obj= new MethodOverloding();
		obj.add(3, 4);
		obj.add(5, 5,6);
		obj.add(9, 10.8f);
		obj.add(45.9f, 3);
		
	}

}
