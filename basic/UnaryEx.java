package basic;

public class UnaryEx {

	public static void main(String[] args) {
		int x = 100;  
		 int y = ++x * 10 / x++ + ++x;
		 int z=~x;
		 int a=+x;
		 System.out.println(y);
		 System.out.println(z);
		 System.out.println(a);
	}

}
