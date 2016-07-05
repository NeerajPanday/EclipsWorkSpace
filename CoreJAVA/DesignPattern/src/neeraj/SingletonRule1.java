package neeraj;

public class SingletonRule1 {

	public static void main(String[] args) {
		Hello h=Hello.getHello();
		System.out.println(h);
		System.out.println(Hello.getHello());
		System.out.println(Hello.getHello());
      // Hello h2=(Hello)h.clone(){
    	 //  return ins;
       }
       //The method clone() from the type Object is not visible
	}
/* 
 1. Declare private static variable of the same class that holds single instance of the class.
 2. Define Constructor as private to restrict instantiation of the class from outside.
 3. Define public static method that returns the single instance of the class.
 */

class Hello
{
	private static Hello ins=null;
	
	private Hello(){
		
	}
	static{
	ins=new Hello();
	}
	public static Hello getHello(){
		return ins;
	}
}
