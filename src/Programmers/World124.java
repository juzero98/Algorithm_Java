package Programmers;

/*
 * 프로그래머스 - 124 나라의 숫자
 * 
 * 0-0
 * 1-1
 * 2-2
 * 3-10
 * 4-11
 * 5-12
 * 6-20
 * ...
 * 
 * 하나씩 앞으로 당기기 위해 n-1 수행
 * 
 * */
public class World124 {

	public static void main(String[] args) {
		int n = 4;
		
		int[] arr = {1, 2, 4};
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(arr[(n-1) % 3]);
			n = (n-1) / 3;
		}
		
		System.out.println(sb.reverse().toString());

	}

	

}
