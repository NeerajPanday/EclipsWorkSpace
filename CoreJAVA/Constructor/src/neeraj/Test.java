package neeraj;

public class Test {

	static int count=0;
	{
		count++;
	}
	Test(){}
	
	Test(int i)
	{
		this.count=i;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(11);
		Test t3=new Test();
		Test t4=new Test();
		Test t5=new Test();
		System.out.println(count);

	}

}
