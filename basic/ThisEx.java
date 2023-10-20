package basic;

public class ThisEx {
	int a,b,c;
	ThisEx(){
		this(1,2,3);
		System.out.println("My default constructor");
	}
	ThisEx(int a,int b,int c){
		//this();
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	//public void setdata(int a,int b,int c1) {
		//this.a=a;
		//this.b=b;
		//c=c1;
	//}
	void msg() {
		System.out.println("hii");
	}
	public void displaydata() {
		this.msg();
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("value of c:"+c);

	}
	public static void main(String[] args) {
		ThisEx e=new ThisEx();
		
		//e.setdata(10,20,30);
		e.displaydata();
		
	}

}
