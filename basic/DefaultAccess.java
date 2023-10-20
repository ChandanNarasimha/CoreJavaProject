package basic;

public class DefaultAccess {

	public static void main(String[] args) {
		Demo d=new Demo(3);
		d.display();
		PrivateEx p=new PrivateEx();
		p.test();
	}

}
