package selva;

import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter your name:");
      String name=s1.nextLine();
      System.out.println("Welcome"+name);
	}

}
