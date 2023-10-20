package basic;

abstract class A {

	public abstract void func(int a,int b);//cannot use abstract static and abstract final
	
}
class B extends A {
	
	public void func(int a,int b){
		a=a;
		b=b;
		int c=a+b;
		System.out.println("Static abstract method implemented.");
		System.out.println("C= "+c);
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		
	B B=new B();
		B.func(5,6);
		
	}

}
