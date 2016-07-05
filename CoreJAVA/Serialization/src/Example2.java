import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(new Account());
        FileInputStream fis=new  FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Account a1=(Account)ois.readObject();
        System.out.println(a1.name+" "+a1.l);
	}
}


class Account implements Serializable{
	String name="Neeraj";
	transient int l=2001021224;
}