package oops;

public class PublicEx {
	
	public String s= "Chandan";
	
	public void display() {
		System.out.println("My name : "+s);
		
	}
	public static void main(String args[]) {
		PublicEx e=new PublicEx();
		e.display();
	}
}
