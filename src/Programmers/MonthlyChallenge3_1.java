package Programmers;

import java.util.ArrayList;

// ���α׷��ӽ� ����ç���� ����3 1�� ���� ���� ���ϱ�
public class MonthlyChallenge3_1 {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			if(!list.contains(i))
				answer += i;
		}
		
		System.out.println(answer);
	}
}
