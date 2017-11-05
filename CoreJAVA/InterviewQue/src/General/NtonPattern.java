package General;

public class NtonPattern {

	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		System.out.println(Hellonp.getHello());
	}

	}

}
class Hellonp{
	private static Hellonp n=new Hellonp();
	private static Hellonp n1=new Hellonp();
	private Hellonp(){};
	public static Hellonp getHello(){
		if(Math.random()>0.5)
			return n1;
		else
		return n;
	}
}