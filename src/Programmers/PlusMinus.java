package Programmers;

/*
 * ���α׷��ӽ� ���� �ڵ� ç����2 - ���� ���ϱ�
 * 
 * */
public class PlusMinus {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true,false,true};
		
		int result = 0;
		for(int i = 0; i < absolutes.length; i++) {
			result += signs[i] ? absolutes[i] : absolutes[i] * -1;
		}
		
		System.out.println(result);
	}
}
