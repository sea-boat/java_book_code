
public class ExpressionTest {
	public static void main(String[] args) {
		int a = 5;
		int b = a + 3;
		System.out.println("��a=5���Ǹ�ֵ���ʽ������ֵ��" + (a = 5));
		System.out.println("��b=a+3�����������ʽ��ϸ�ֵ���ʽ������ֵ��" + (b = a + 3));
		if (a <= b) {
			System.out.println("��a<=b����boolean���ʽ������ֵ��" + (a <= b));
		}
		System.out.println("��10*10+20/20-3�����������ʽ������ֵ��" + (10 * 10 + 20 / 20 - 3));
	}
}