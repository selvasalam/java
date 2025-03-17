package selva;

import java.util.Scanner;

public class userdata {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Enter your name: ");
			  String name=  scanner.nextLine();
		 System.out.print("Enter an integer: ");
		 int num=scanner.nextInt();
		     System.out.print("Enter a double:");
		     double doublenum=scanner.nextDouble();
		     System.out.print("Enter a float value:");
		     float floatnum= scanner.nextFloat();
		     System.out.print("Enter a boolean value (true/false): ");
		     boolean booleanValue = scanner.nextBoolean();
		     System.out.println("String" + name);
		     System.out.println("Integer" + num);
		     System.out.println("Float" + floatnum);
		     System.out.println("Double" + doublenum);
		     System.out.println("Boolean" + booleanValue);




		     
		}

	}

}
