package basic;

import java.util.Scanner;

public class ConditionStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b and c : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Max is a:"+a);
		}
		if(b>a && b>c) {
			System.out.println("Max is b:"+b);
		}
		else {
			System.out.println("Max is c:"+c);

		}
		
	}

}
