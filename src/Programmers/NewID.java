package Programmers;

/*
 * 2021 카카오 채용 - 신규 아이디 추천
 * 정규표현식을 사용해 처리
 * */
public class NewID {
	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		String result = "";
		
		// 1
		new_id = new_id.toLowerCase();
		
		// 2
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		
		// 3
		new_id = new_id.replaceAll("[.]{2,}", ".");
		
		// 4
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		
		// 5
		if(new_id.length() == 0)
			new_id = "a";
		
		// 6
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("^[.]|[.]$", "");
		}
		
		// 7
		if(new_id.length() <= 2) {
			String last = Character.toString(new_id.charAt(new_id.length()-1));
			new_id = new_id + last.repeat(3-new_id.length());
		}
			
		
		System.out.println(new_id);
		
	}
}
