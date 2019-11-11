package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(0, "Health Care");
		hm.put(10, "Banking and Financials");
		hm.put(20, "Travel and Transport");
		
		Set s = hm.entrySet();
		Iterator i =s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp= (Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		
		}

	}

}
