package Oops.Encapsulation;

import java.util.Scanner;

public class Driver2 {
public static void main(String[] args) {
	College obj=new College();
    Scanner sc=new Scanner(System.in);
    for(;;){
    System.out.println("1.Add Teacher");
    System.out.println("2.Remove Teacher");
    System.out.println("3.Upadate Teacher detail");
    System.out.println("4.show Teacher detail");
    System.out.println("5.exit");
    System.out.println("Enter your choice");
    int c=sc.nextInt();
     switch (c) {
        case 1:obj.addTeacher("Pooja",876342826, "abc@gmail.com",45000.0,"01/09/2025","Marathi");
            
            break;
      case 2:
        obj.removeTeacher();
        break;

        case 3:obj.updateDetail("Pranjali",8463672622l, "xyz@gmail.com",50000.0,"02/10/2025", "English");
        break;

        case 4:obj.display();
        break;

            case 5:
            System.exit(0);
            break;

            default:
            System.out.println("Enter correct input");
     }
    }
}
}
