
public class ExpressionTest {
	public static void main(String[] args) {
		int a = 5;
		int b = a + 3;
		System.out.println("“a=5”是赋值表达式，它的值是" + (a = 5));
		System.out.println("“b=a+3”是算术表达式结合赋值表达式，它的值是" + (b = a + 3));
		if (a <= b) {
			System.out.println("“a<=b”是boolean表达式，它的值是" + (a <= b));
		}
		System.out.println("“10*10+20/20-3”是算术表达式，它的值是" + (10 * 10 + 20 / 20 - 3));
	}
}