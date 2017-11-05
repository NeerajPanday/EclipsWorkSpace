package neeraj;

public class PolyCase3 {

	public void methodOne(String s){
		System.out.println("String version ");
	}
	public void methodOne(StringBuffer f){
		System.out.println("SF version");
	}
	public static void main(String[] args) {
		PolyCase3 p=new PolyCase3();
		p.methodOne("Neeraj");
		p.methodOne(new StringBuffer("OM"));
		//p.methodOne(null);
		//Ambiguous for the null because null is present under both.

	}
    
}
