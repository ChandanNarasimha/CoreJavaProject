package basic;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		char operator;
		int num1,num2,result;
		Scanner input=new Scanner(System.in);
		System.out.println("Choose Operator: +,-,*,/ :");
		operator = input.nextLine().charAt(0);
		System.out.println("Operator=>"+operator);
		
		 System.out.println("Enter first number");
		    num1 = input.nextInt();

		    System.out.println("Enter second number");
		    num2 = input.nextInt();

		    switch (operator) {

		      
		      case '+':
		        result = num1 + num2;
		        System.out.println(num1 + " + " + num2 + " = " + result);
		        break;
		      case '-':
			        result = num1 - num2;
			        System.out.println(num1 + " - " + num2 + " = " + result);
			        break;
		      case '*':
			        result = num1 * num2;
			        System.out.println(num1 + " * " + num2 + " = " + result);
			        break;
		      case '/':
			        result = num1 / num2;
			        System.out.println(num1 + " / " + num2 + " = " + result);
			        break;
			  default :System.out.println("Invalid input");
			  
	}
	}
}
