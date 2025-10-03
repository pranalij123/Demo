
//Program showing encapsulation with private fields and getters/setters.
package Oops.Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Account obj = new Account("Pranali Jadhav", 1234567890L, "Savings", 50000.0, "Pune Branch", "IFSC12345",
				"9876543210", "pranali@example.com");
		System.out.println(obj.getName());
		System.out.println(obj.getActType());
		System.out.println(obj.getActNo());
		obj.setName("Ram");
		obj.setActType("Current");
		obj.setActNo(97354263);
		System.out.println("*****************************************************************");
		System.out.println(obj.getName());
		System.out.println(obj.getActType());
		System.out.println(obj.getActNo());
	}
}
