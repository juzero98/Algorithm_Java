package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1920 {
	private static int n, m;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		// 배열 정렬 (오름차순)
		Arrays.parallelSort(arr);

		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.append(findNum(num) + "\n");
		}

		bw.close();
	}

	public static int findNum(int num) {
		int left = 0, right = n - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] > num)
				right = mid - 1;
			else if (arr[mid] < num)
				left = mid + 1;
			else
				return 1;
		}

		return 0;
	}
}

// 이분 탐색
// Arrays.sort()를 이용하여 배열을 오름차순으로 정렬
// left, right, mid를 지정
// 찾고자하는 값과 mid의 값을 비교하여 left와 right의 값을 조정
// 찾으면 1을 반환, 찾지 못하면(left와 right가 교차되면) 0을 반환

