import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example3 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Neeraj());
		oos.writeObject(new Tiku());
		oos.writeObject(new Achu());
		System.out.println("Serialization Completed");
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o instanceof Neeraj){
			Neeraj n1=(Neeraj)o;
			System.out.println(" This is neeraj object"+n1.a);
		}else if(o instanceof Tiku){
			System.out.println("this is tiku object ");
		}else {
			System.out.println("this is Achu Object");
		}
      
	}

}
class Neeraj implements Serializable{
	transient int a=20;
}
class Tiku implements Serializable{
	int b=30;
}
class Achu implements Serializable{
	int c=10;
}