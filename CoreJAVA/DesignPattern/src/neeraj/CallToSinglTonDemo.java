package neeraj;

public class CallToSinglTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySinglotonDemo c1=MySinglotonDemo.MySinglotonDemoObjectFactoryData();
		MySinglotonDemo c2=MySinglotonDemo.MySinglotonDemoObjectFactoryData();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
