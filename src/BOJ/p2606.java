package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * ���� - ���̷���
 * 
 * �׷����� �� ������������ ������ �� �ִ� �������� ã�� ����
 * dfs, bfs ��� ���������� �ӵ��� ���� bfs ���
 * 
 * */
public class p2606 {
	private static int count = 0;
	private static ArrayList<ArrayList<Integer>> graph;
	private static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		graph = new ArrayList<>();
		visited = new boolean[n + 1];
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		String[] sp;
		for(int i = 0; i < m; i++) {
			sp = (br.readLine()).split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		bfs(1);
		System.out.println(count);
	}
	
	public static void bfs(int n) {
		visited[n] = true;
		
		Queue<Integer> que = new LinkedList<>();
		que.add(n);
		
		while(!que.isEmpty()) {
			int node = que.poll();
			ArrayList<Integer> list = graph.get(node);
			for(int cur : list) {
				if(!visited[cur]) {
					visited[cur] = true;
					count++;
					que.add(cur);
				}
			}
		}
		
		
	}
}
