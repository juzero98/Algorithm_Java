package Programmers;

/*
 * 프로그래머스 - 행렬의 덧셈
 * 
 * */
public class SumMatric {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int rows = arr1.length;
		int cols = arr1[0].length;
		
		int[][] result = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++)
				result[i][j] = arr1[i][j] + arr2[i][j];
		}
	}
}
