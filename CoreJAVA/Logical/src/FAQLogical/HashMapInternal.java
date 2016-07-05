package FAQLogical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInternal {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		
		h.put("null", "Mohan");
		h.put("a", "Neeraj");
		h.put("D", "Hero");
		h.put("P", "Kumar");
		System.out.println(h);
		Set s1=h.entrySet();
		System.out.println(s1);
		Iterator i=s1.iterator();
		while(i.hasNext()){
			Map m=(Map)i.next();
		}
			
		
		}
		
	}


