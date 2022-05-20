package Programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 프로그래머스 해시 - 완주하지 못한 선수
 * 
 * HashMap 사용하여 <참가자, 동명이인수> 형식으로 값 넣기
 * Map.getOrDefault(값, 기본값) : 값이 있으면 반환하고, 값이 없으면 기본값을 반환
 * 
 * */
public class Marathon {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "mislav", "ana"};
		String result = "";
		
		Map<String, Integer> map = new HashMap<>();
		for(String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		for(String c : completion) {
			map.put(c, map.get(c) - 1);
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 0) {
				result = entry.getKey();
				break;
			}
				
		}
		
		System.out.println(result);
	}
}
