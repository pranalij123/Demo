package Oops.Inheritance.Has_A_Relationship.Aggrigation;

public class Laptop {
	 private String brand;
	    private String model;

	    public Laptop(String brand, String model) {
	        this.brand = brand;
	        this.model = model;
	    }

	    public void showLaptopDetails() {
	        System.out.println("Laptop Brand: " + brand + ", Model: " + model);
	    }
}
