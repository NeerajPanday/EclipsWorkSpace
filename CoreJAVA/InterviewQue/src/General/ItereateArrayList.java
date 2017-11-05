package General;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItereateArrayList {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Neeraj");
		l.add("Kumar");
		l.add("Pandey");
		Iterator i=l.iterator();
		while(i.hasNext()){
		//	String o=(String) i.next();
			Object o=i.next();
			System.out.println(o);
		}
				
	}

}
