import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example7 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Np n1=new Np();
		n1.a=111;
		n1.b=222;
		FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos); 
        oos.writeObject(n1);
       
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Np n=(Np)ois.readObject();
        System.out.println(n.a+" "+n.b);
	}

}
class Hai{
	Hai(){
		System.out.println("Hai Cons is called");
	}
	int a=10;
}
class Np extends Hai implements Serializable{
	Np(){
		System.out.println("np cons is called");
	}
	int b=10;
	
}
