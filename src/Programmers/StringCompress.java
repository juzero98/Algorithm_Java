package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* 프로그래머스 / 2020 카카오 공채 / 문자열 압축 */
public class StringCompress {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		solve("aabbacccc");
		bw.append("");
		bw.close();
	}

	public static int solve(String str) {
		int answer = 0;
		compress(str);
		
		return answer;
	}
	
	public static String compress(String str) {
		int len = str.length();
		String s;
		for(int i = 1; i < len; i++) {
			for(int j = 0; j + i < len; j++) {
				s = str.substring(j, j + i);
				System.out.print(s + ", ");
			}
			System.out.println();
		}
		
		return "";
	}
}
