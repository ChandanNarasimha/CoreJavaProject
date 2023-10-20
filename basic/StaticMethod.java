package basic;
class Operation
{
	void addition(int a,int b,int c) {
	System.out.println("Addition :"+(a+b+c));
	}
	int divide(int a,int b) {
		return a/b;
	}
	String displayName(String name) {
		return "Hello World"+name;
	}
	static int add(int a, int b) {
		return a+b;
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
	Operation o=new Operation();
	o.addition(5,4,3);
	System.out.println("Divide :"+o.divide(15,5));
	System.out.println("Display :"+o.displayName("\n This is chandan"));
	System.out.println("Sum is :"+o.add(15,5));
	}

}
