package Oops.Inheritance.Has_A_Relationship.Aggrigation;

public class Driver {
	public static void main(String[] args) {
       
        Laptop dell = new Laptop("Dell", "Inspiron 15");

       
        Human pranali = new Human("Pranali", dell);

       
        pranali.showDetails();
    }
}
