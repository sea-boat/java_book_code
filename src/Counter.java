
public class Counter {
	public static int num = 0;

	public Counter() {
		Counter.num++;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
			new Counter();
		System.out.println(Counter.num);
	}
}
