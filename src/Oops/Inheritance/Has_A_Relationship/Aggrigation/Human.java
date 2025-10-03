package Oops.Inheritance.Has_A_Relationship.Aggrigation;

public class Human {
	private String name;
    private Laptop laptop; 
    public Human(String name, Laptop laptop) {
        this.name = name;
        this.laptop = laptop;
    }

    public void showDetails() {
        System.out.println("Human Name: " + name);
        laptop.showLaptopDetails();
    }
}
