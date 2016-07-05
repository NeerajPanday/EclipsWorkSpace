package General;

import java.util.Comparator;

public class SortById implements Comparator {
	public int compare(Object o1,Object o2){
		Hellon n1=(Hellon)o1;
		Hellon n2=(Hellon)o2;
		return n1.sid-n2.sid;
		
		
	}

}
