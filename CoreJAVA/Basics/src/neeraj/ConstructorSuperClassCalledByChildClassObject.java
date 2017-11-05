package neeraj;
abstract class Parent {
	Parent(){
		System.out.println(this.hashCode());
	}
}
class Child extends Parent{
	Child(){
		System.out.println(this.hashCode());
		// once child class object is created , called to parent class constructor
	}
}
public class ConstructorSuperClassCalledByChildClassObject {
	

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.hashCode());

	}

}
