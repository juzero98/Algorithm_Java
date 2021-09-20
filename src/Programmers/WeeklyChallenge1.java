package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WeeklyChallenge1 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.append(solve(3, 20, 4) + "");
		bw.close();
	}

	public static long solve(int price, int money, int count) {
		long total = price * (count * ((long)count + 1) / 2);

		return money >= total ? 0 : total - money;
	}
}
