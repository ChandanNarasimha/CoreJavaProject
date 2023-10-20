package oops;

import java.util.Scanner;

public class Exception {
	public Exception(String message) {
		// TODO Auto-generated constructor stub
	}
	public static void validatedMarks(int marks) {
		if(marks>0 && marks<=100) {
			System.out.println("marks is:"+marks);
		}else {
			throw new ArithmeticException("invalid marks");
		}
	}
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter marks:");
	int marks=sc.nextInt();

	}

}










/*class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
	
}
public class InvalidAgeExample {
    public String checkAge(int age) throws MyException {
    	if(age>18) {
    		return "valid age";
    	}else {
    		throw new MyException("invalid age");
    	}
    	
    }
	public static void main(String[] args)  {
		InvalidAgeExample i=new InvalidAgeExample();
		try {
			String s=i.checkAge(24);
			System.out.println(s);
			
		} catch (MyException e) {
			System.out.println(e);
			
		}
		

	}

}*/
