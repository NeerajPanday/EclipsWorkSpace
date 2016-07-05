import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization completed");
		System.out.println("Deserialization Started");
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream  ois=new ObjectInputStream(fis);
		Dog d1=(Dog)ois.readObject();
		System.out.println(d1.c.r.a);
		System.out.println("Deserialization completed");
		

	}

}
class Dog implements Serializable{
	Cat c=new Cat();
}
class Cat implements Serializable{
	Rat r=new Rat();
	
}
class Rat implements Serializable
{
	 static transient int a=20;
}