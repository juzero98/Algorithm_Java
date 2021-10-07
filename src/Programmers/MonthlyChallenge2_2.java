package Programmers;

import java.util.Stack;

// ���α׷��ӽ� ����ç���� ����2 2�� ��ȣ ȸ���ϱ�
public class MonthlyChallenge2_2 {

	private static Stack<Character> stack;

	public static void main(String[] args) {
		String s = "[](){}";
		int answer = 0;
		stack = new Stack<Character>();

		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s);
			if (isValid(s))
				answer++;
			sb.append(s.charAt(0));
			sb.delete(0, 1);
			s = sb.toString();
		}

		System.out.println(answer);

	}

	public static boolean isValid(String s) {
		char c;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;

			case ')':
				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				else
					stack.pop();
				break;

			case '}':
				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				else
					stack.pop();
				break;

			case ']':
				if (stack.isEmpty() || stack.peek() != '[')
					return false;
				else
					stack.pop();
				break;

			}
		}

		// "{{{"�� ���
		if (!stack.isEmpty()) {
			if (stack.peek() == '(' || stack.peek() == '[' || stack.peek() == '{')
				return false;
		}

		return true;
	}
}
