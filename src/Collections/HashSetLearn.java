package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLearn {

	public static void main(String[] args) {
		HashSet <String> h= new HashSet<String>();
		h.add("Wipro");
		h.add("TCS");
		h.add("Rapid Value");
		h.add("TCS");
		System.out.println(h);
		//hashset implements set interface. it won't allow duplicates
		//h.remove("Rapid Value");
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.contains("TCS"));
		System.out.println(h.size());
		//iterator
		System.out.println(h);
		Iterator<String> i =h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
