package neeraj;

import java.lang.reflect.Constructor;

public class TestSingleton {

	public static void main(String[] args) throws Exception {
		Hai h1=Hai.getHai();
		System.out.println(h1);
		System.out.println(Hai.getHai());
		System.out.println(Hai.getHai());
		// through reflection api
		Class c1=Class.forName("neeraj.Hai");
		Constructor <Hai> c2=c1.getDeclaredConstructor();
		c2.setAccessible(true);
		Hai h3=c2.newInstance();
		System.out.println(h3);
	}

}
class Hai{
	//private static Hai h =new Hai();
	private static Hai h=null;
	
	private Hai() throws NotCreateObject 	{
		if(h!=null){
			throw new NotCreateObject();
		}
	}
	public static Hai getHai() throws NotCreateObject {
		if(h==null){
			h=new Hai();
		}
		return h;
		
	}
}
  