package neeraj;

public class HeapDemo {

	public static void main(String[] args) {
		long mb=1024*1024;
		Runtime r=Runtime.getRuntime();
		System.out.println(r.maxMemory()/mb+"max memory");
		System.out.println(r.freeMemory()/mb+"free memory");
		System.out.println(r.totalMemory()/mb+"total memory"); 	
	}

}
