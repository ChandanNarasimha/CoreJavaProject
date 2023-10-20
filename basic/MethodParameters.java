package basic;
class  UserInput{
	public void data(int a,int b) {
		System.out.println("sum"+a+" "+b);
	}
}
class UserAddition extends UserInput{
	public void data(int a,int b) {
		System.out.println("sum:"+(a+b));
	}
}
public class MethodParameters {

	public static void main(String[] args) {
		UserInput u=new UserAddition();
		u.data(3, 7);
		UserInput i=new UserInput();
		i.data(4, 6);
	}

}
