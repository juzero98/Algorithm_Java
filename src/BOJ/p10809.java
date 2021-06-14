package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		br.close();
		
		for(char c = 'a'; c <= 'z'; c++)
			bw.append(s.indexOf(c) + " ");
		bw.close();
	}
}

// 문자열
// 'a'부터 'z'까지 반복
// String.indexOf(char c)는 첫 번째로 찾은 위치를 반환함
// 찾지 못하면 -1을 반환하기 때문에 따로 처리해줄 필요 없음

