package Programmers;

/*
 * 프로그래머스 level3 - 네트워크
 * 
 * 1부터 n까지 반복하며 dfs 호출
 * 이 때, 이미 방문한 정점은 dfs 호출 X
 * 인접행렬 사용
 * 
 * */
public class Network {
	private static boolean[] visited;

	public static void main(String[] args) {
		int n = 3;
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		visited = new boolean[n + 1];

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(computers, n, i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void dfs(int[][] arr, int n, int num) {
		visited[num] = true;

		for (int i = 0; i < n; i++) {
			if (arr[num-1][i] == 1 && !visited[i+1]) {
				dfs(arr, n, i+1);
			}
		}

	}
}
