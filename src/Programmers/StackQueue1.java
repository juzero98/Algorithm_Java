package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 스택/큐 기능개발
public class StackQueue1 {
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i = 0; i < progresses.length; i++) {
			int n = 100 - progresses[i];
			int day = n % speeds[i] == 0 ? n / speeds[i] : n / speeds[i] + 1;
			
			que.offer(day);
		}
		
		while(!que.isEmpty()) {
			int num = que.poll();
			int count = 1;
			while(!que.isEmpty() && num >= que.peek()) {
				count++;
				num = que.poll();
			}
			list.add(count);
		}
		
		System.out.println(list.toString());
	}
}