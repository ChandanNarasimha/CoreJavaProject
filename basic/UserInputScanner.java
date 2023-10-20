package basic;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		/*System.out.println("Enter ur name:");
		String name=scanner.nextLine();
		System.out.println("Name :"+name);
		System.out.println("Enter ur age:");
		int age=scanner.nextInt();
		System.out.println("Age:"+age);
		System.out.println("Enter ur percentage:");
		float percentage=scanner.nextFloat();
		System.out.println("Percentage :"+percentage);
		*/
		System.out.println("Enter ur name,age,percentage : ");
		String name=scanner.nextLine();
		int age=scanner.nextInt();
		float percentage=scanner.nextFloat();
		System.out.println("Name :"+name);
		System.out.println("Age:"+age);
		System.out.println("Percentage :"+percentage);
	}

}
