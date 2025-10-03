package Exception.RunTime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx{
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	try {
		int a=sc.nextInt();
	}
	catch(InputMismatchException e) {
		System.out.println(" InputMismatchException handled");
	}
}
}
