package Collections;

import java.util.ArrayList;

public class LearnArraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Rapid");
		a.add("Value");
		System.out.println(a);
		a.add(1, "-");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.add("Wipro");
		a.add("Technologies");
		a.add("LTD");
		System.out.println(a);
		
//		System.out.println(a.contains("Wipro"));
//		a.remove(4);
//		System.out.println(a);
//		a.remove("Wipro");
//		System.out.println(a);
//		a.removeAll(a);
//		System.out.println(a);
		
		System.out.println(a.get(2));
		System.out.println(a.contains("Wipro"));
		System.out.println(a);
		System.out.println(a.indexOf("Value"));
		System.out.println(a.isEmpty());
		System.out.println(a);
		System.out.println(a.size());
		a.add(5, "Wipro");
		System.out.println(a);
		System.out.println(a.indexOf("Wipro"));

		

	}

}
