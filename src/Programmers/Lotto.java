package Programmers;

/*
 * 2021 웹 백엔드 데브매칭 - 로또의 최고 순위와 최저 순위
 * Math.max / min 사용
 */
public class Lotto {
	public static void main(String[] args) {
		int[] lottos = { 38, 0, 1, 2, 3, 4 };
		int[] win_nums = { 38, 19, 20, 40, 15, 25 };
		int[] result = new int[2];

		int cnt = 7, zeroCnt = 0;

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zeroCnt++;
				continue;
			}
			for (int n : win_nums) {
				if(lottos[i] == n) {
					cnt--;
					continue;
				}
			}

		}
		if(zeroCnt == 0) {
			result[0] = result[1] = cnt == 7 ? 6 : cnt;		
		} else {
			result[0] = Math.max(cnt - zeroCnt, 1);
			result[1] = Math.min(cnt, 6);
		}
		
		System.out.println(result[0] + ", " + result[1]);
		

	}
}
