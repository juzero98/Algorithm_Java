package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p10816 {
	private static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.parallelSort(arr);
			
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();
		
		int num, first, last;
		for(int i = 0; i < m; i++) {
			num = Integer.parseInt(st.nextToken());
			first = lowerBound(num, 0, n-1);
			last = upperBound(num, 0, n-1);
			bw.append((last-first) + " ");
		}
		bw.close();
	}
	
	public static int lowerBound(int num, int left, int right) {
		while(left < right) {
			int mid = (left + right) / 2;
			if(arr[mid] >= num)
				right = mid;
			else
				left = mid + 1;
		}
		return right;
	}
	
	public static int upperBound(int num, int left, int right) {
		while(left < right) {
			int mid = (left + right) / 2;
			if(arr[mid] > num)
				right = mid;
			else
				left = mid + 1;
		}
		if(arr[left] == num) right++;
		return right;
	}
}

// 이분 탐색 (Lower Bound, Upper Bound 이용)
// 숫자의 개수 = (마지막 위치+1) - (처음 위치)
// 해당 숫자가 처음 나오는 위치와 마지막으로 나오는 위치를 구해서 차이를 구함
// Lower Bound : 크거나 같으면 끝을 mid로 옮김, 작으면 시작을 mid+1로 옮김
// Upper Bound : 크면 끝을 mid로 옮김, 작거나 같으면 시작을 mid+1로 옮김
// Upper Bound에서는 추가로 배열의 크기를 넘어갔을 경우 +1을 해줌


