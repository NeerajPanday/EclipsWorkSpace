package neeraj;

import java.lang.reflect.Constructor;

public class MultithreadSinglethread {

	public static void main(String[] args) throws Exception {
		Hai h1=Hai.getHai();
		System.out.println(h1);
		System.out.println(Hai.getHai());
		System.out.println(Hai.getHai());
		// through reflection api
		
		//c2.setAccessible(true);
		//Hai h3=c2.newInstance();
		//System.out.println(h3);
	}

}
class Hai1{
	
}
  