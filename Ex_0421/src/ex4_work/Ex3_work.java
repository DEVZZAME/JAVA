package ex4_work;

import java.util.Scanner;

public class Ex3_work {

	public static void main(String[] args) {

		// Ű���忡�� ������ �Է� �ް�, �Է� ���� ���� �Ҽ����� �ƴ����� �Ǵ��Ͻÿ�.
		// �Ҽ�(����� 1�� �� �ڽŸ� �����ϴ� ��)

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int n = sc.nextInt();

		int i = 0;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			System.out.println(n + "(��)�� �Ҽ��� �½��ϴ�!");
		} else {
			System.out.println(n + "(��)�� �Ҽ��� �ƴմϴ�~");
		}
	}

}
