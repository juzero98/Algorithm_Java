package Programmers;

// 2018 īī�� ����ε� ä�� 3�� n���� ����
// Integer.toString(int i, int radix)�� �̿��� ���� ��ȯ Ǯ��
public class NotationGame2 {
	
	public static void main(String[] args) {
		int n = 16;	// ����
		int t = 16;	// �̸� ���� ���� ���� (result�� ����)
		int m = 2;	// ���� ���� �ο�
		int p = 1;	// ����
		String result = "";
		
		StringBuilder sb = new StringBuilder();
		int num = 0;
		
		while(sb.length() < t * m) {
			sb.append(Integer.toString(num++, n));
		}
		
		String str = sb.toString();
		
		sb = new StringBuilder();
		for(int i = p; i <= t * m; i += m) {
			sb.append(str.charAt(i-1));
		}
		
		result = sb.toString().toUpperCase();
		System.out.println(result);
	}
}
