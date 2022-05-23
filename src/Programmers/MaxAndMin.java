package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 프로그래머스 - 최댓값과 최솟값
 * */
public class MaxAndMin {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		
		// Collections의 sort 이용
		String[] sp = s.split(" ");
		List<Integer> list = new ArrayList<>();
		for(String str : sp) {
			list.add(Integer.parseInt(str));
		}
		Collections.sort(list);
		String answer = list.get(0) + " " + list.get(list.size()-1);
		System.out.println(answer);
		
		
		// 값 직접 비교
		int max = Integer.parseInt(sp[0]);
		int min = Integer.parseInt(sp[0]);
		for(String str : sp) {
            int num = Integer.parseInt(str);
            System.out.println(num);
            if(max < num) max = num;
            if(min > num) min = num;
		}
		answer = min + " " + max;
		System.out.println(answer);
	}
}
