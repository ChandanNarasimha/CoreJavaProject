package basic;

public class LocalVariableEx {
	String name="abc";
	public void displayAge() {
		int age=0;
		age=age+30;
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		LocalVariableEx ex=new LocalVariableEx();
		ex.displayAge();
		System.out.println("Name:"+ex.name);
	}

}
