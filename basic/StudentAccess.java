package basic;

class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void displayPerson() {
		System.out.println("Data of the Person class: ");
		System.out.println("Name: " + this.name);
	}
}
public class StudentAccess extends Person {
	public void displayStudent() {
		System.out.println("Data of the Student class: ");
	}

	public static void main(String[] args) {
		StudentAccess std = new StudentAccess();
	
		std.setName("Chandan");
		System.out.println(std.getName());
		std.displayPerson();
		std.displayStudent();
	}
}
