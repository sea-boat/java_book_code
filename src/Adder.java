
public class Adder {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static float add(float a, float b, float c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(Adder.add(10, 10));
		System.out.println(Adder.add(10, 10, 10));
		System.out.println(Adder.add(10.0, 10.0));
		System.out.println(Adder.add(10f, 10f, 10f));
	}

}
