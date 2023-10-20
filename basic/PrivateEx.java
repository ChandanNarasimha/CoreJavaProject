package basic;

class Demo{
	int a;

	public Demo(int b) {
		a=b;
		System.out.println(b);
	}
	void display() {
		int c=28;
		System.out.println(c);
	}
}
public class PrivateEx {
	private int e;
	private int f=1;
	
	public void test() {
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		Demo d=new Demo(10);
		d.display();
		
		PrivateEx p=new PrivateEx();
		p.e=5;
		System.out.println(p.e);
		p.test();
		
	}

}
