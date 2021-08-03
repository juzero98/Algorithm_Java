package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Divisor {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.append(solve(24,27) + "");
		bw.close();
	}
	
	public static int solve(int left, int right) {
		int total = 0, count = 0;
		for(int i = left; i <= right; i++) {
			count = getDivisorCount(i);
			if(count % 2 == 0)
				total += i;
			else
				total -= i;
		}
		
		return total;
	}
	
	// 약수 개수 반환 메서드
	public static int getDivisorCount(int n) {
		int count = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {	// 제곱근까지 약수 개수 구하기
			if(n % i == 0) {
				count++;
				if(i * i < n)	// 중복 제외하고 +1
					count++;
			}	
		}
		
		return count;
	}
}
