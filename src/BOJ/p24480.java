package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 백준 깊이우선탐색2 - 내림차순으로 탐색
 * 
 * 인접 리스트로 그래프 구현 후 내림차순 정렬
 * 재귀를 이용하여 dfs 구현
 * 
 * */
public class p24480 {
	
	private static int[] answer;
	private static int idx = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sp = (br.readLine()).split(" ");

		int n = Integer.parseInt(sp[0]);
		int m = Integer.parseInt(sp[1]);
		int r = Integer.parseInt(sp[2]);
		answer = new int[n+1];
		
		boolean[] visited = new boolean[n + 1];
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}

		int a, b;
		for (int i = 0; i < m; i++) {
			sp = (br.readLine()).split(" ");
			a = Integer.parseInt(sp[0]);
			b = Integer.parseInt(sp[1]);

			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		for (int i = 0; i < n + 1; i++) {
			Collections.sort(graph.get(i), Collections.reverseOrder());
		}

		dfs(graph, visited, r);
		for (int i = 1; i <= n; i++) {
			System.out.println(answer[i]);
		}

	}

	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int r) {
		visited[r] = true;
		answer[r] = ++idx;
		
		ArrayList<Integer> list = graph.get(r);
		for (int i = 0; i < list.size(); i++) {
			int cur = list.get(i);
			if (visited[cur] == false) {
				dfs(graph, visited, cur);
			}
		}

	}

}
