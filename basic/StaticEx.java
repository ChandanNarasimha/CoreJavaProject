package basic;

class Student {
	static int fee;
	static String name="chandan";
}
public class StaticEx {
	public static void main(String[] args) {
		Student.fee=1000;
		System.out.println("fee:"+Student.fee);
		Student.name="dinesh";
		System.out.println("name:"+Student.name);
		
	}

}
