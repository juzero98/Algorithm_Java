package Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * 2022 īī�� ����ε� ä�� ���� 1�� �Ű� ��� �ޱ�
 * �ؽ� �ڷᱸ�� ����Ͽ� Ǯ��
 */
public class GetReportResult {

	
	public static void main(String[] args) {
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;

		// value : �ڽ��� �Ű��� ���� ����Ʈ
		Map<String, HashSet<String>> reported = new HashMap<String, HashSet<String>>();
		for(String id : id_list)
			reported.put(id, new HashSet<String>());
		
		String[] sp = new String[2];
		for(String r : report) {
			sp = r.split(" ");
			reported.get(sp[1]).add(sp[0]);
		}
		
		// value : �ڽ��� �Ű��� ���� �� ������ ��
		Map<String, Integer> notified = new HashMap<String, Integer>();
		for(String id : id_list)
			notified.put(id, 0);
		
		for(String id : reported.keySet()) {
			if(reported.get(id).size() >= k) {
				for(String report_user : reported.get(id)) {
					notified.replace(report_user, notified.get(report_user)+1);
				}
			}
		}
		
		for(String id : id_list) {
			System.out.println(id + ": " + notified.get(id));
		}

	}
	
	

}
