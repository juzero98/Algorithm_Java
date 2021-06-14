package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String s = br.readLine();
		br.close();
		
		int[] countAlp = new int[26];
		int idx = 0, max = 0;
		for(int i = 0; i < s.length(); i++) {
			idx = Character.toUpperCase(s.charAt(i)) - 'A';
			countAlp[idx]++;
			max = Math.max(countAlp[idx], max);
		}
		
		int countAnswer = 0;
		char answer = ' ';
		for(int i = 0; i < 26; i++) {
			if(max == countAlp[i]) {
				countAnswer++;
				if(countAnswer > 1) {
					answer = '?';
					break;
				}
				answer = (char)('A'+i);
			}
		}
		bw.append(answer);
		bw.close();
	}
}
