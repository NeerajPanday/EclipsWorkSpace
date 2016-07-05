package FAQLogical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterte {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("A", 101);
		h.put("B", 102);
		h.put("a", 103);
		h.put("D", 105);
		h.put("C", 105);
		Set t=h.entrySet();
		Iterator i=t.iterator();
		while(i.hasNext()){
			Entry m=	(Entry) i.next();
		System.out.println( m.getKey()+"  "+m.getValue());
		}
	}

}
