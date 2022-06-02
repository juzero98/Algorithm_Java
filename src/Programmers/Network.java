package Programmers;

/*
 * ���α׷��ӽ� level3 - ��Ʈ��ũ
 * 
 * 1���� n���� �ݺ��ϸ� dfs ȣ��
 * �� ��, �̹� �湮�� ������ dfs ȣ�� X
 * ������� ���
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
