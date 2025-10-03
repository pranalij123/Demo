package Oops.Inheritance.Has_A_Relationship.Composition;

public class Mobile {
	String brand;
    SimCard sim; 

    Mobile(String brand, String simProvider) {
        this.brand = brand;
       
        this.sim = new SimCard(simProvider);
    }

    void showMobileDetails() {
        System.out.println("Mobile Brand: " + brand);
        sim.showSim();
    }
}
