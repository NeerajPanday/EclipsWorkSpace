package neeraj;

public class CloneSinglten {

	public static void main(String[] args) {
		Neeraj h=Neeraj.getNeeraj();
		System.out.println(h);
		System.out.println(Neeraj.getNeeraj());
		Neeraj t=(Neeraj) h.colne();
			System.out.println(t);
		}
		
	}

class Neeraj{
	private static Neeraj n=new Neeraj();
	private Neeraj(){
		System.out.println("Neeraj instanse creating....");
	}
	public static Neeraj getNeeraj(){
		return n;
	}
	protected Object colne(){
		return n;
	}
}