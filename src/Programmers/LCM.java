package Programmers;

import java.util.Arrays;

/*
 * ���α׷��ӽ� - N���� �ּҰ����
 * 
 * �ִ����� = ��Ŭ���� ȣ����
 * �ּҰ���� = (a * b) / �ִ�����
 * 
 * */
public class LCM {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		Arrays.sort(arr);
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		// ���Ұ� 1���� �ش� ���� ��ȯ
		if(arr.length == 1)
			return arr[0];
		
		// ���Ұ� 2�� �̻��� ��
		int rslt = (arr[1] * arr[0]) / gcd(arr[1], arr[0]);
		int a, b;
		for(int i = 1; i < arr.length - 1; i++) {
			a = Math.max(rslt, arr[i+1]);
			b = Math.min(rslt, arr[i+1]);
			rslt = (a * b) / gcd(a, b);
		}
		
		return rslt;
	}
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
}
