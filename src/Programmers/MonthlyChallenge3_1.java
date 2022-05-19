package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

/* 
 * 프로그래머스 월간챌린지 시즌3 1번 없는 숫자 더하기
 * 
 * */
public class MonthlyChallenge3_1 {
	
	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		int answer = 0;
		
		// 내가 푼 방법
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		for(int n : numbers)
			list.remove(list.indexOf(n));
		
		for(int n : list) {
			answer += n;
		}
		
		System.out.println(answer);
		
		
		
		// 간단한 방법
		answer = 45;
		for(int n : numbers) {
			answer -= n;
		}
		System.out.println(answer);
		
	}
}
