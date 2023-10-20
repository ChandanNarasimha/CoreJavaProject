package collectioex;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		ArrayList<Integer> a= new ArrayList<Integer>();
		al.add("Mani");
		al.add("aaaa");
		a.add(5);
		a.add(8);
		
		/*for(int i=0;i<al.size();i++) {
		
		System.out.println(al.get(i));
	}
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i));
		}*/
		System.out.println(al);
		System.out.println(a);
	}
}
