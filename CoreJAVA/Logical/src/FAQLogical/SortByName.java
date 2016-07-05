package FAQLogical;

import java.util.Comparator;

public class SortByName implements Comparator {
	public int compare(Object obj1,Object obj2){
		Employee1 e1=(Employee1)obj1;
		Employee1 e2=(Employee1)obj2;
		
		return e1.add.compareTo(e2.add);
		
	}

}
