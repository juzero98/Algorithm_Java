package Programmers;

/*
 * 프로그래머스 - JadenCase 문자열 만들기
 * 
 * 일괄 소문자로 변환한뒤 split으로 공백 기준으로 자름
 * 공백일 경우, 공백을 넣기
 * 문자일 경우, 첫 글자만 대문자로 변환 후 넣기
 * 
 * */
public class JadenCase {
	public static void main(String[] args) {
		String s = "3people  unFollowed me  ";

		// 소문자로 변환 + 마지막 공백 처리를 위해 임의로 문자 추가
		s = s.toLowerCase() + ".";
		String[] sp = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : sp) {

			// 공백 문자일 경우
			if (str.isBlank()) {
				sb.append(" ");
				continue;
			}
			char c = Character.toUpperCase(str.charAt(0));
			str = c + str.substring(1, str.length());
			sb.append(str + " ");

		}
		System.out.println(sb.substring(0, sb.length() - 2).toString());

	}
}
