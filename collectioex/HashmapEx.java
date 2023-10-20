package collectioex;

import java.util.HashMap;
import java.util.HashSet;

public class HashmapEx {

	public static void main(String[] args) {
		HashMap<String,Integer> H=new HashMap<String,Integer>();
		H.put("aaa",5);
		H.put("yyy",6);
		System.out.println(H);
		H.remove("yyy",6);
		System.out.println(H);
		HashSet<String> h=new HashSet<String>();
		h.add("bbb");
		System.out.println(h);
	}

}
