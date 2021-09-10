package Programmers;

import java.util.HashMap;

// 해시 - 위장
public class SpyLook {

	public static void main(String[] args) {
		String[][] clothes = { { "yellowhat", "face" }, { "bluesunglasses", "face" }, { "green_turban", "face" } };

		System.out.println(solve(clothes));
	}

	public static int solve(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}

		for (String key : map.keySet()) {
			answer *= (map.get(key) + 1);
		}

		return answer - 1;
	}

}
