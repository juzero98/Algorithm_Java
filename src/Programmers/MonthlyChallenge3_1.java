package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

/* 
 * ���α׷��ӽ� ����ç���� ����3 1�� ���� ���� ���ϱ�
 * 
 * */
public class MonthlyChallenge3_1 {
	
	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		int answer = 0;
		
		// ���� Ǭ ���
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		for(int n : numbers)
			list.remove(list.indexOf(n));
		
		for(int n : list) {
			answer += n;
		}
		
		System.out.println(answer);
		
		
		
		// ������ ���
		answer = 45;
		for(int n : numbers) {
			answer -= n;
		}
		System.out.println(answer);
		
	}
}
