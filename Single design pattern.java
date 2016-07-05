Singleton design pattern:-
this is one of mostly used design pattern
Definition:-
insure that a class has only one instance of that class. and provide global point of access yo it.
Implementation:-
1.Restrict constructor:-make constructor as private. let the class itself  manage its instance.
2.Provide global access:-a static method to get the sole instance.
For Example:
package pattern;

class Singleton{
	private static Hello h=new Hello();
	private Hello(){}
	public static Hello getHello(){
		rettrn h;
	}
}
public class Neeraj{
	public static void main(String...as){
		Hello h1=Hello.getHello();
		System.out.println(h1);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());
		//h1.clone();
       //	this clone method is not visible here.so cant create clone here.	
	}
}
but here some hidden issues ie, voilet the singleton principle 
     1.Refletion api
     2.Serialization / deserialization
     3. clone
     4. Multithreaded access
     5.multiple class loaders.
     6. Garbage coollection.
	 in this All six cases Singleton is not valid principle.
	 so we have to prevent for this.
	 
	 
	 1.*Adject code to violet the singlton wirh Reflection API*
	 **********************************
	 mport java.lang.reflect.Constructor;

public class TestSingleton {

	public static void main(String[] args) throws Exception {
		Hai h1=Hai.getHai();
		System.out.println(h1);
		System.out.println(Hai.getHai());
		System.out.println(Hai.getHai());
		Class c1=Class.forName("neeraj.Hai");
		Constructor <Hai> c2=c1.getDeclaredConstructor();
		c2.setAccessible(true);
		Hai h3=c2.newInstance();
		System.out.println(h3);
	}

}
class Hai{
	private static Hai h =new Hai();
	private Hai(){}
	public static Hai getHai(){
		return h;
		
	}
}
	2. violence the singleton through Serialization 
      **********************************************
	   package neeraj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Testsingleton2 implements Serializable {

	public static void main(String[] args) throws Exception {
		Bye b1=Bye.getBye();
		Bye b2=Bye.getBye();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(Bye.getBye());
		//Serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);
		//Deserialization
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
		Bye bye=(Bye)ois.readObject();
		System.out.println(bye);
	}

}
class Bye{
	private static Bye b=new Bye();
	private Bye(){}
	public static Bye getBye(){
		return b;
	}
}
3. violence through clone.
*********************************
package neeraj;



public class TestSingleton3  {

	public static void main(String[] args) throws CloneNotSupportedException {
		Tai t1=Tai.getTai();
		System.out.println(Tai.getTai());
		System.out.println(Tai.getTai());
		Tai t2=(Tai) t1.clone();
		System.out.println("colne   "+t2);
		

	}

}
class Tai implements Cloneable{
	private static Tai t=new Tai();
	Tai(){
		System.out.println("creating");
	}
	public static Tai getTai(){
		return t;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
4. through multithreaded.
************************
5. Multiple  class Loaders
************************
Realtime Example of Singleton
 1. in jdk class is Runtime . and why it is singleton is jdk follw only one run environment at a time.
 2. Logmanager .single logmanager is available across application
 3. Resourse management . db if i dont want to make instance of database conection.
  
  
  
  *How to FIX the violence the singleton *
  ****************************************
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
  package neeraj;

public class NotCreateObject extends Exception {

}
*now to resolve from reflection api*
************************************
