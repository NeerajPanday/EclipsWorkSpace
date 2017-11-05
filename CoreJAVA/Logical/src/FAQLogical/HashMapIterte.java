package FAQLogical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterte {

	public static void main(String[] args) {
		
		/*System.out.println("a".hashCode());
		System.out.println("A".hashCode());*/
		HashMap h=new HashMap();
		System.out.println(h.size());
		h.put("A", 101);
		h.put(null, 101);
		h.put("a", 102);
		/*h.put("a", 103);
		h.put("A", 105);*/
		System.out.println(h);
		/*h.put("C", 105);
		Set t=h.entrySet();
		Iterator i=t.iterator();
		while(i.hasNext()){
			Entry m=	(Entry) i.next();
		System.out.println( m.getKey()+"  "+m.getValue());*/
		//}
	}
}
