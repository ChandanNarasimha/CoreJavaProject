package oops;

public class ExceptionEx {
	//static void validateAge(int age) {
	void validateAge(int age) {
		if(age<18) {
			System.out.println("Welcome");
		}
		else {
			throw new ArithmeticException("Invalid Age");
	}
	}
	public static void main(String[] args) {
		//validateAge(13);
		ExceptionEx E=new ExceptionEx();
		E.validateAge(13);

}
}
