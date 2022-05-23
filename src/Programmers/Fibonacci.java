package Programmers;

/*
 * 프로그래머스 - 피보나치 수
 * 
 * 재귀함수 -> 시간 초과
 * 1234567로 나누는 이유 -> int형의 범위를 유지하기 위해서
 * 피보나치 수는 빠르게 증가하기 때문에 재귀함수를 사용하면 오래 걸림
 * 계산할 때마다 1234567로 나누기!
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
