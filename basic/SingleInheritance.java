package basic;

class Animal{
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal{
	public void animalSound() {
		super.animalSound();
		System.out.println("The Dog barks!!!");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog myDog=new Dog();
		myDog.animalSound();
		
	}

}
