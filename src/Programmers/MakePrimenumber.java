package Programmers;


/*
 * 프로그래머스 썸머윈터코딩 2018 - 소수 만들기
 * 
 * for문으로 가능한 순열 중 더했을 때 소수를 만족하는지 확인
 * 소수 검사 - 2부터 숫자의 제곱근까지 중 0으로 나눠떨어지는 값이 있으면 소수가 아님
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
