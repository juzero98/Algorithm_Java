package Programmers;

/*
 * ���α׷��ӽ� - �ܾ� ��ȯ
 * 
 * ��Ʈ��ŷ���� ���ǿ� �´� �ܾ Ž��
 * 
 * */
public class ConvertWord {

	private static boolean[] visited;
	private static int value = 51;
	
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		int answer = 0;

		// �־��� Ÿ���� words �ȿ� �ִ��� Ȯ��
		if (!isOk(words, target)) {
			System.out.println(answer);
			return;
		}
		
		visited = new boolean[words.length];
		backTracking(words, target, 0, begin);
		
		System.out.println(value);
	}

	// �迭�� Ÿ���� �ִ��� Ȯ��
	public static boolean isOk(String[] words, String target) {
		for (String w : words) {
			if (w.equals(target)) {
				return true;
			}
		}
		return false;
	}

	// �� ���ڸ� ��ȯ�� �ܾ����� Ȯ��
	public static boolean check(String word, String target) {
		int count = 0;
		for (int j = 0; j < target.length(); j++) {
			if (word.charAt(j) == target.charAt(j))
				count++;
		}
		
		if(count == target.length() - 1)
			return true;
		
		return false;
		
		
	}

	public static void backTracking(String[] words, String target, int depth, String str) {
		System.out.println(str);
		if (target.equals(str)) {
			value = Math.min(value, depth);
			return;
		}
		
		for(int i = 0; i < words.length; i++) {
			if(!visited[i] && check(str, words[i])) {
				visited[i] = true;
				backTracking(words, target, depth+1, words[i]);
				visited[i] = false;
			}
		}
	}

}
