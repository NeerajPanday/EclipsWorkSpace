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
		oos.close();
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
	private Object readResolve() {
		System.out.println("Read resolve is working");
		return b;
		
	}
}