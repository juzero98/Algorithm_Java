package Programmers;

// 2018 īī�� ����ε� ä�� 3�� n���� ����
// ���� ���� ��ȯ Ǯ��
public class NotationGame1 {
	
	public static void main(String[] args) {
		int n = 16;	// ����
		int t = 16;	// �̸� ���� ���� ���� (result�� ����)
		int m = 2;	// ���� ���� �ο�
		int p = 1;	// ����
		String result = "";
		
		int totalCnt = t * m;
		int currentCnt = 0;
		StringBuilder sb = new StringBuilder();
		int num = 0;
		String str;
		while(currentCnt < totalCnt) {
			str = convert(num, n);
			sb.append(str);
			currentCnt += str.length();
			num++;
		}
		
		String str2 = sb.toString();
		
		sb = new StringBuilder();
		for(int i = p; i <= totalCnt; i += m) {
			sb.append(str2.charAt(i-1));
		}
		
		result = sb.toString();
		
	}
	
	public static String convert(int num, int n) {
	
		StringBuilder sb = new StringBuilder();
		
		if(num == 0)
			return "0";
		
		while(num > 0) {
			int tmp = num % n;
			switch(tmp) {
			case 10:
				sb.append('A');
				break;
			case 11:
				sb.append('B');
				break;
			case 12:
				sb.append('C');
				break;
			case 13:
				sb.append('D');
				break;
			case 14:
				sb.append('E');
				break;
			case 15:
				sb.append('F');
				break;
			default:
				sb.append(tmp);
				break;
			}
			
			num /= n;
		}
		
		return sb.reverse().toString();
	}
}
