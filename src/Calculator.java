
public class Calculator {
	public static int addition(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		System.out.println(Calculator.addition(10, 5));
		Calculator calculator = new Calculator();
		System.out.println(calculator.subtraction(20, 10));
	}
}
