package neeraj;

public final class MySinglotonDemo {

	private static MySinglotonDemo m=null;
	
	private MySinglotonDemo(){
		System.out.println("MySinglotonDemo is created");
	}
	
	static{
		m=new MySinglotonDemo();
	}
	
	public static MySinglotonDemo MySinglotonDemoObjectFactoryData(){
		return m;
		
	}
}
