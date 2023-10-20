package oops;

public class ClassNotFounfEx {

	public static void main(String[] args) {
		try {
			//Class.forName("class not found");
			Class.forName("basic.EnumEx");
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Found");
		}catch(ClassNotFoundException e) {
			//TODO Auto-generated catch block
			//e.printStacktrace();
			System.out.println(e);
		}
	}

}
