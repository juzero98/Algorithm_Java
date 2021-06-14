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


// 문자열
// A~Z의 개수를 세는 int타입 배열 생성
// 개수를 세면서 최댓값을 구함
// 배열을 순회하며 최댓값을 가진 알파벳 도출, 이 때 최댓값이 2개 이상이면 ? 출력 후 반복문 탈출

