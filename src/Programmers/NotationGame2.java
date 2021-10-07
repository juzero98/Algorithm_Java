package Programmers;

// 2018 카카오 블라인드 채용 3차 n진수 게임
// Integer.toString(int i, int radix)를 이용한 진법 변환 풀이
public class NotationGame2 {
	
	public static void main(String[] args) {
		int n = 16;	// 진법
		int t = 16;	// 미리 구할 숫자 갯수 (result의 길이)
		int m = 2;	// 게임 참가 인원
		int p = 1;	// 순서
		String result = "";
		
		StringBuilder sb = new StringBuilder();
		int num = 0;
		
		while(sb.length() < t * m) {
			sb.append(Integer.toString(num++, n));
		}
		
		String str = sb.toString();
		
		sb = new StringBuilder();
		for(int i = p; i <= t * m; i += m) {
			sb.append(str.charAt(i-1));
		}
		
		result = sb.toString().toUpperCase();
		System.out.println(result);
	}
}
