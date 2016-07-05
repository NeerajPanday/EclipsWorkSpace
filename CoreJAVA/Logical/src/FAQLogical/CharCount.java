package FAQLogical;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		String s="aaabbbccdd";
		map.put(s.charAt(0), 1);
		System.out.println(map);
		for (int i = 1; i <s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
			  map.put(s.charAt(i), map.get(s.charAt(i))+1);
			  
			}else{
				map.put(s.charAt(i),1);
			}
		}
		System.out.println(map);
	}

}
