package Programmers;

import java.util.PriorityQueue;

// 프로그래머스 level2-더 맵게 (PriorityQueue 사용)
public class Scoville2 {

	private static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
		 
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
		int result = 0;
		int n1, n2;
		
		for(int n : scoville)
			pq.add(n);
	
		while(pq.peek() < K) {
			if(pq.size() < 2) {
				result = -1;
				break;
			}
			
			n1 = pq.poll();
			n2 = pq.poll();
			
			pq.add(n1 + (n2 * 2));
			
			result++;
			System.out.println(pq.toString());
		}

		return result;
	}
	
	

}