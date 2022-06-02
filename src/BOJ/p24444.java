package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 백준 너비우선탐색1 - 오름차순으로 탐색
 * 
 * 인접 리스트로 그래프 구현 후 오름차순 정렬
 * 큐를 사용하여 bfs 구현
 * 
 * */
public class p24444 {
	
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

		for (int i = 1; i <= n; i++) {
			Collections.sort(graph.get(i));
		}

		bfs(graph, visited, r);
		for (int i = 1; i <= n; i++) {
			System.out.println(answer[i]);
		}

	}

	public static void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int r) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(r);
		
		while(!que.isEmpty()) {
			int node = que.poll();
			answer[node] = ++idx;
			ArrayList<Integer> list = graph.get(node);
			for(int i = 0; i < list.size(); i++) {
				int cur = list.get(i);
				if (!visited[cur]) {
					visited[cur] = true;
					que.add(cur);
				}
			}
		}
	}

}
