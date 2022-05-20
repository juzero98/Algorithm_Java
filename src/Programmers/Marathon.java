package Programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * ���α׷��ӽ� �ؽ� - �������� ���� ����
 * 
 * HashMap ����Ͽ� <������, �������μ�> �������� �� �ֱ�
 * Map.getOrDefault(��, �⺻��) : ���� ������ ��ȯ�ϰ�, ���� ������ �⺻���� ��ȯ
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
