package Programmers;

/*
 * ���α׷��ӽ� - JadenCase ���ڿ� �����
 * 
 * �ϰ� �ҹ��ڷ� ��ȯ�ѵ� split���� ���� �������� �ڸ�
 * ������ ���, ������ �ֱ�
 * ������ ���, ù ���ڸ� �빮�ڷ� ��ȯ �� �ֱ�
 * 
 * */
public class JadenCase {
	public static void main(String[] args) {
		String s = "3people  unFollowed me  ";

		// �ҹ��ڷ� ��ȯ + ������ ���� ó���� ���� ���Ƿ� ���� �߰�
		s = s.toLowerCase() + ".";
		String[] sp = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : sp) {

			// ���� ������ ���
			if (str.isBlank()) {
				sb.append(" ");
				continue;
			}
			char c = Character.toUpperCase(str.charAt(0));
			str = c + str.substring(1, str.length());
			sb.append(str + " ");

		}
		System.out.println(sb.substring(0, sb.length() - 2).toString());

	}
}
