package Programmers;

/*
 * 프로그래머스 - 행렬의 곱셈
 * 
 * 삼중 for문으로 풀이
 * arr1의 열수 = arr2의 행수
 * 결과는 [arr1 행수][arr2 열수]
 * 
 * i : arr1의 행
 * j : arr2의 열
 * k : arr1의 열이자 arr2의 행
 * 
 * */
public class MulMatric {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] arr2 = { { 3, 5 }, { 3, 5 } };

		int rows = arr1.length;
		int cols1 = arr1[0].length;
		int cols2 = arr2[0].length;

		int[][] result = new int[rows][cols2];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					result[i][j] += (arr1[i][k] * arr2[k][j]);
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols2; j++)
				System.out.print(result[i][j]);
			System.out.println();
		}

	}
}
