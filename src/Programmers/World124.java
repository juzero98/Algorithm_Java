package Programmers;

/*
 * ���α׷��ӽ� - 124 ������ ����
 * 
 * 0-0
 * 1-1
 * 2-2
 * 3-10
 * 4-11
 * 5-12
 * 6-20
 * ...
 * 
 * �ϳ��� ������ ���� ���� n-1 ����
 * 
 * */
public class World124 {

	public static void main(String[] args) {
		int n = 4;
		
		int[] arr = {1, 2, 4};
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(arr[(n-1) % 3]);
			n = (n-1) / 3;
		}
		
		System.out.println(sb.reverse().toString());

	}

	

}
