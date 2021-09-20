package Programmers;

import java.util.HashMap;

public class WeeklyChallenge2 {

	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };

		System.out.println(solve(scores));
		
		}
	
	public static String solve(int[][] scores) {
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> map = new HashMap<>();
		double total = 0, tmp = 0;
		for (int i = 0; i < scores.length; i++) {
			int max = 0, min = 101;
			total = 0;
			tmp = scores.length;
			for (int j = 0; j < tmp; j++) {
				if (scores[j][i] > max)
					max = scores[j][i];
				if (scores[j][i] < min)
					min = scores[j][i];
				
				total += scores[j][i];
				if(map.containsKey(scores[j][i]))
					map.put(scores[j][i], map.get(scores[j][i]) + 1);
				else
					map.put(scores[j][i], 1);
			}
			
			if(scores[i][i] == max || scores[i][i] == min) {
				if(map.get(scores[i][i]) == 1) {
					total -= scores[i][i];
					tmp--;
				}
			}
			
			total /= tmp;
			if(total >= 90)
				sb.append("A");
			else if (total >= 80)
				sb.append("B");
			else if (total >= 70)
				sb.append("C");
			else if (total >= 50)
				sb.append("D");
			else 
				sb.append("F");
			
			map.clear();
		}
		
		return sb.toString();
		
	}

}
