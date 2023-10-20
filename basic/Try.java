package basic;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur choice:");
		
		for(int row=scanner.nextInt();row<=3;row++) {;
		System.out.println("numbers are:"+row);
		
		for (int i = 0; i <=row; i++) {
			for (int j = row-i; j > 0; j--) { 

			System.out.print(" "); 
			}

			for (int j = 0; j <= i; j++) { 
			System.out.print(i +" "); 
			}
			System.out.println(); //Newline
			}
	}

}
}