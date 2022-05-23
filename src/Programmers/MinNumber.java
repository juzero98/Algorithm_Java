package Programmers;

import java.util.Arrays;

/*
 * ���α׷��ӽ� - �ּڰ� �����
 * 
 * �迭 a�� ��������, �迭 b�� ������������ �����Ͽ� ���Ͽ� ���� ���� �ּڰ�
 * Arrays.sort()�� ���������� �����ϹǷ� for������ �迭 b�� �Ųٷ� ������
 * 
 * */
public class MinNumber {
	public static void main(String[] args) {
		int[] a = { 1, 4, 2 };
		int[] b = { 5, 4, 4 };

		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		int len = a.length;
		for(int i = 0; i < len; i++) {
			sum += (a[i] * b[len-i-1]);
		}
		System.out.println(sum);

	}
}
