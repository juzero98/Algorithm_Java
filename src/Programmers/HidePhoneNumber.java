package Programmers;

/*
 * 프로그래머스 - 핸드폰 번호 가리기
 * 
 * */
public class HidePhoneNumber {
	public static void main(String[] args) {
		String phone_number = "027778888";
		
		int len = phone_number.length() - 4;
		String answer = new String("*").repeat(len) + phone_number.substring(len);
		System.out.println(answer);
	}
}
