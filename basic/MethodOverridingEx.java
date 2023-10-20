package basic;
class Learner{
	public void lname() {
		System.out.println("My name is chandan");
	}
	void courseName() { 
		//Limitations : ->for Private we cannot override it 
		//-> instance method cannot override the static method
		//-> Cannot override the final method from Learner
		//-> cannot override the constructor in java
		System.out.println("Java full stack");
	}
	void courseDuration(){
		System.out.println("4 months");
	}
}
class Lcourse extends Learner{
	protected void courseName() { // cannot reduce the visibility of inherited method in child class
		super.courseName();
		System.out.println("Data analystics");
	}
	@Override
	void courseDuration(){
		System.out.println("2 months");
	}
	
	void analystics() {
		System.out.println("Analystics");
	}
}
public class MethodOverridingEx {

	public static void main(String[] args) {
		Learner l=new Lcourse();
		l.courseName();
		l.lname();
		l.courseName();
		l.courseDuration();
		//Learner le=new Learner();
		//le.courseName();
		//le.lname();
	}

}
