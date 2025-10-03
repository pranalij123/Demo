package Exception.CompileTime;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
           
            Class.forName("MyNonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
	}

}
