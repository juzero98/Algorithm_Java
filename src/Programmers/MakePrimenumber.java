package Programmers;


/*
 * ���α׷��ӽ� ��������ڵ� 2018 - �Ҽ� �����
 * 
 * for������ ������ ���� �� ������ �� �Ҽ��� �����ϴ��� Ȯ��
 * �Ҽ� �˻� - 2���� ������ �����ٱ��� �� 0���� ������������ ���� ������ �Ҽ��� �ƴ�
 * 
 * */
public class MakePrimenumber {
	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					if(isPrime(nums[i] + nums[j] + nums[k])) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	public static boolean isPrime(double n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
