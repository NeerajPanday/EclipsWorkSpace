package FAQLogical;

public class DeadLock {

	public static void main(String[] args) throws InterruptedException {
		Mythread t=new Mythread();
		Thread t1=new Thread(t);
		System.out.println(t.getState());
		t1.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
		Thread.sleep(50000);
		System.out.println(t1.getState());

	}

}
class Mythread extends Thread{
	public void run(){
		Thread th=Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+" "+th.getState());
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}