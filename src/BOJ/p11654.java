package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char input = br.readLine().charAt(0);
		br.close();
		bw.append((int)input + "");
		bw.close();
	}
}

// 문자열
// char타입의 아스키 코드 -> int타입으로 형변환하면 됨
