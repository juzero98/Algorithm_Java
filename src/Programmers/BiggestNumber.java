package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {

	public static void main(String[] args) {
		int[] numbers = { 3, 30, 34, 5, 9 };

		System.out.println(solve(numbers));
	}

	public static String solve(int[] numbers) {
		String answer = "";
		String[] str = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++)
			str[i] = String.valueOf(numbers[i]);

		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}

		});

		if (str[0].equals("0"))
			return "0";

		for (String s : str)
			answer += s;

		return answer;
	}

}
