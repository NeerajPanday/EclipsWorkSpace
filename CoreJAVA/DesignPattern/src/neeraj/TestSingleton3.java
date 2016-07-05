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