package packages;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		int num,c=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i == 0) {
		    //System.out.println(i);
				c++;
			}
			if(c==2) {
				System.out.println(num+" is prime");
			}else {
					System.out.println(num+" is not prime");
				}
			}
		}
		
	}


