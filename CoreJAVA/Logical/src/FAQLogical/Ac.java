package FAQLogical;

public class Ac {

	int a = 128;
	int b = 128;
	Integer c = 128;
	Integer d = 128;

	public void show() {
		System.out.println(a == b);

	}

	public void display() {
		System.out.println(c==d);
	}

	public static void main(String[] args) {
		Ac a = new Ac();
		a.show();
		a.display();
	}
}
