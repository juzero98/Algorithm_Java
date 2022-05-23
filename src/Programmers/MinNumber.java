package Programmers;

import java.util.Arrays;

/*
 * 프로그래머스 - 최솟값 만들기
 * 
 * 배열 a는 오름차순, 배열 b는 내림차순으로 정렬하여 곱하여 더한 값이 최솟값
 * Arrays.sort()는 오름차순만 지원하므로 for문에서 배열 b는 거꾸로 곱해줌
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
