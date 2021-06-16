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

// �̺� Ž�� (Lower Bound, Upper Bound �̿�)
// ������ ���� = (������ ��ġ+1) - (ó�� ��ġ)
// �ش� ���ڰ� ó�� ������ ��ġ�� ���������� ������ ��ġ�� ���ؼ� ���̸� ����
// Lower Bound : ũ�ų� ������ ���� mid�� �ű�, ������ ������ mid+1�� �ű�
// Upper Bound : ũ�� ���� mid�� �ű�, �۰ų� ������ ������ mid+1�� �ű�
// Upper Bound������ �߰��� �迭�� ũ�⸦ �Ѿ�� ��� +1�� ����


