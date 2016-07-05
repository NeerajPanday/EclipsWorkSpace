import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Hello h=new Hello();
		FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(h);
        System.out.println("************");
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Hello ac=(Hello)ois.readObject();
        System.out.println(ac.uname+" "+ac.pwd);
	}

}
class Hello implements Serializable{
	String uname="Mohan";
	transient String pwd="Kumar";
	private void writeObject(ObjectOutputStream os)throws Exception{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
	}
}