import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class KPIT {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(fos);
		System.out.println("Deserialize started");
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream();
		Dog s=(Dog)ois.readObject();
		System.out.println(s.i+"  "+s.j);

	}		
	}


class Dog implements Serializable {
	int i=10;
	int j=20;
}