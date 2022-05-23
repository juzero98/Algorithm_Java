package Programmers;

import java.util.Arrays;

/*
 * 프로그래머스 - N개의 최소공배수
 * 
 * 최대공약수 = 유클리드 호제법
 * 최소공배수 = (a * b) / 최대공약수
 * 
 * */
public class LCM {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		Arrays.sort(arr);
		
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] arr) {
		// 원소가 1개면 해당 원소 반환
		if(arr.length == 1)
			return arr[0];
		
		// 원소가 2개 이상일 때
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
