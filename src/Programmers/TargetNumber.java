package Programmers;

// DFS/BFS - Å¸°Ù ³Ñ¹ö
public class TargetNumber {
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
	
		int answer = dfs(numbers, target, 0, 0);
		
		System.out.println(answer);
		
	}
	
	public static int dfs(int[] numbers, int target, int depth, int sum) {
		if(depth == numbers.length) {
			if(sum == target)
				return 1;
			return 0;
		}
		return dfs(numbers, target, depth+1, sum + numbers[depth]) +
				dfs(numbers, target, depth+1, sum - numbers[depth]);
	}

}
