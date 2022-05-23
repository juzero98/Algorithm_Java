package Programmers;

/*
 * ���α׷��ӽ� - �Ǻ���ġ ��
 * 
 * ����Լ� -> �ð� �ʰ�
 * 1234567�� ������ ���� -> int���� ������ �����ϱ� ���ؼ�
 * �Ǻ���ġ ���� ������ �����ϱ� ������ ����Լ��� ����ϸ� ���� �ɸ�
 * ����� ������ 1234567�� ������!
 * 
 * */
public class Fibonacci {
	public static void main(String[] args) {
		int n = 5;

		int answer[] = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			if (i == 0)
				answer[i] = 0;
			else if (i == 1 || i == 2)
				answer[i] = 1;
			else {
				answer[i] = (answer[i-2] + answer[i-1]) % 1234567; 
			}
		}

		System.out.println(answer[n]);
	}
}
