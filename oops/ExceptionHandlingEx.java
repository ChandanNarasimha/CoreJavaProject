package oops;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		try {//try
			int[] a= {1,2,3};
			System.out.println(a[67]);
			int c=10/0;
			System.out.println(c);
		}catch(ArrayIndexOutOfBoundsException a) {//catch
			System.out.println("Some eror in code"+a);
	}
		catch(ArithmeticException c) {//catch
			System.out.println("Number cannot be divided by zero"+c);
	}
	finally {
		System.out.println("Finally Block: " );
	}

}
}