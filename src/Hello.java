
public class Hello {

	public static void hello(int a) {
		if (a == 0) {
			return;
		}
		System.out.println("Hello Java!");
	}

	public static void main(String args[]) {
		hello(0);
		hello(1);
	}

}
