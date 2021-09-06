package Programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// 2019 KAKAO BLIND RECRUITMENT - 오픈채팅방

public class OpenChattingroom {

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		
		Queue<String> que = new LinkedList<String>();
		HashMap<String, String> user = new HashMap<>();

		String[] sp;
		for (String r : record) {
			sp = r.split(" ");
			switch (sp[0]) {
			case "Enter":
				user.put(sp[1], sp[2]);
				que.offer(sp[1] + "/님이 들어왔습니다.");
				break;
			case "Leave":
				que.offer(sp[1] + "/님이 나갔습니다.");
				break;
			case "Change":
				user.put(sp[1], sp[2]);
				break;
			}
		}
		
		String[] answer = new String[que.size()];
		String[] sp2;
		int i = 0;
		while(!que.isEmpty()) {
			sp2 = que.poll().split("/");
			answer[i] = user.get(sp2[0]) + sp2[1];
			i++;
		}
		
		for(String s : answer)
			System.out.println(s);

	}
}
