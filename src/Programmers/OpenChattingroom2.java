package Programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OpenChattingroom2 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234"
				,"Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		
		ArrayList<String> list = new ArrayList<>();
		Map<String, String> user = new HashMap<>();
		
		String[] sp;
		for(String r : record) {
			sp = r.split(" ");
			if(sp[0].equals("Enter")) {
				list.add(sp[1] + "/님이 들어왔습니다.");
				user.put(sp[1], sp[2]);
			} else if(sp[0].equals("Leave")) {
				list.add(sp[1] + "/님이 나갔습니다.");
			} else if(sp[0].equals("Change")) {
				user.put(sp[1], sp[2]);
			}
		}
		
		int len = list.size();
		String[] result = new String[len];
		for(int i = 0; i < len; i++) {
			sp = list.get(i).split("/");
			result[i] = user.get(sp[0]) + sp[1];
		}
		
		for(int i = 0; i < len; i++)
			System.out.println(result[i]);
		
	}
}
