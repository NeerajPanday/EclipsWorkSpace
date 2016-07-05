import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.imageio.IIOException;

public class Externalization1 {

	public static void main(String[] args) {
		Kumar k=new Kumar("Neeraj" , 10,40);
		// after the same as serialization

	}

}
class Kumar{
	String s;
	int j;
	int k;
	public Kumar(String s, int i, int j2){
		System.out.println("no args cons");
	}
	public void kumar(String s, int j , int k){
		this.s=s;
		this.j=j;
		this.k=k;
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeObject(k);
	}
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException{
		s=(String)in.readObject();
		k=in.readInt();
	}
}