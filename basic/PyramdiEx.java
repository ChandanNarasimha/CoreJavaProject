package basic;

import java.util.Scanner;

public class PyramdiEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter first number:");
		int row1=scanner.nextInt();
		//System.out.println("numbers from 0 to "+row1);
		//System.out.println("Enter second number:");
		int row2=scanner.nextInt();
		//System.out.println("numbers from 0 to "+row2);
		//System.out.println("Enter third number:");
		int row3=scanner.nextInt();
		//System.out.println("numbers from 0 to "+row3);
		
		for (int i =0 ; i <=row1; i++) {

			for (int j = row1-i; j > 0; j--) { 

			System.out.print(" "); 
			}

			for (int j = 1; j <= i; j++) { 
			System.out.print(i +" "); 
			}
			System.out.println(); //Newline
			}
		
		
		
		for (int i = 0; i <=row2; i++) {

			for (int j = row2-i; j > 0; j--) { 

			System.out.print(" "); 
			}

			for (int j = 1; j <= i; j++) { 
			System.out.print(i +" "); 
			}
			System.out.println(); //Newline
			}
		
		
		
		for (int i = 0; i <=row3; i++) {

			for (int j = row3-i; j > 0; j--) { 

			System.out.print(" "); 
			}

			for (int j = 1; j <= i; j++) { 
			System.out.print(i +" "); 
			}
			System.out.println(); //Newline
			}
	}

}
