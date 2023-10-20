package packages;

import java.util.Scanner;

interface Validate{
	boolean login(String uname,String password);
}



public class LambdaEx {
	boolean login(String uname,String password) {
		Validate v=( uname1,password1)->{
			return (uname1.equals("tanuja")&&(password1.equals("12345"))?true:false);
		};
		return v.login(uname,password);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LambdaEx l=new LambdaEx();
		
		
	}
}
