package neeraj;

public class N_tonPattern {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			System.out.println(Hello.getHello());
		}
	}

}
class HelloN{
	private static HelloN h1=new HelloN();
	private static HelloN h2=new HelloN();
	private HelloN(){}
	public static HelloN getHelloN()
	{
		if(Math.random()>0.5)
			return h1;
		else
			return h2;
	}
}
