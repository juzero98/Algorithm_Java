package Programmers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class level1_average {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = {1,2,3,4};
		double sum = 0.0;
		
        for(int n : arr)
            sum += n;
        
		bw.append(sum / arr.length+"");
		bw.close();
	}
}

