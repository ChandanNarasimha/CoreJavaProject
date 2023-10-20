package collectioex;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> s=new LinkedList<String>();
		s.add("aaa");
		s.addLast("ccc");
		s.addFirst("bbb");
	
		s.add("ddd");
		//for(int i=0;i<s.size();i++) {
			System.out.println(s);
		}
	//}

}
