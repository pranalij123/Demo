package Oops.Inheritance.Has_A_Relationship.Composition;

public class SimCard {
	String provider;

    SimCard(String provider) {
        this.provider = provider;
    }

    void showSim() {
        System.out.println("SIM Provider: " + provider);
    }
}
