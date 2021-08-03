package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StringToNum {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "onetwo34five";
		
		bw.append(solve(s) + "");
		bw.close();
	}
	
	public static int solve(String s) {
		String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if(s.matches("[0-9]*"))
        	return Integer.parseInt(s);
        for(int i = 0; i < engNum.length; i++)
        	s = s.replaceAll(engNum[i], String.valueOf(i));
        
        return Integer.parseInt(s);
	}
}
