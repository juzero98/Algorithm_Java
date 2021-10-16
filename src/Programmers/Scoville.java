package Programmers;

import java.util.ArrayList;

//���α׷��ӽ� level2-�� �ʰ� (ArrayList ���)
public class Scoville {

	private static Heap minHeap;

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;
		int result = 0;
		
		minHeap = new Heap(scoville);

		while (!check(k)) {
			if (!mix()) {
				result = -1;
				break;
			}
			result++;
		}
		result = result == 0 ? -1 : result;
		System.out.println(result);
	}

	public static boolean mix() {
		// ������ ������ 2�� �̸��� ���
		if (minHeap.getSize() - 1 < 2)
			return false;

		int n1 = minHeap.delete();
		int n2 = minHeap.delete();

		minHeap.insert(n1 + (n2 * 2));

		return true;
	}

	public static boolean check(int k) {
		if (minHeap.get(1) < k)
			return false;
		
		return true;
	}

}

class Heap {

	private ArrayList<Integer> heap;

	// 1. ������
	public Heap(int[] arr) {
		heap = new ArrayList<Integer>();
		heap.add(0); // 0��° �ε��� ��� X
		for(int i = 0; i < arr.length; i++)
			insert(arr[i]);
		
	}

	// 2. ����
	public void insert(int val) {
		heap.add(val);
		int idx = heap.size() - 1;
		while (idx > 1 && heap.get(idx / 2) > heap.get(idx)) { // 1) ��Ʈ ���� 2) �θ𺸴� ���� �� �ݺ��� ����
			swap(idx, idx / 2); // ���� ���� �θ� ��� �ٲٱ�

			idx /= 2; // �θ� ��� �ε��� ������ ����
		}
	}

	// 3. ����
	public int delete() {
		if (heap.size() - 1 < 1) {
			return 0;
		}

		int item = heap.get(1); // ��Ʈ ��� ������

		swap(1, heap.size() - 1); // ���� ���� ��Ʈ ��� �ٲٱ�
		heap.remove(heap.size() - 1);
		
		int idx = 1;
		while ((idx * 2) < heap.size()) {
			int min = heap.get(idx * 2); // ���� �ڽ� ���
			int minPos = idx * 2;

			if ((idx * 2 + 1) < heap.size() && min > heap.get(idx * 2 + 1)) { // ������ �ڽ� ��尡 �ְ� ���� �ڽ� ��庸�� ���� ��
				min = heap.get(idx * 2 + 1);
				minPos = idx * 2 + 1;
			}
			
			if(min > heap.get(idx))	// �θ� ��尡 �� ������ �ݺ��� ����
				break;
			
			swap(idx, minPos);
			idx = minPos;
			
		}

		return item;
	}

	public void swap(int idx1, int idx2) {
		int tmp = heap.get(idx1);
		heap.set(idx1, heap.get(idx2));
		heap.set(idx2, tmp);
	}
	
	public int get(int idx) {
		return heap.get(idx);
	}
	
	public int getSize() {
		return heap.size();
	}
	
	@Override
	public String toString() {
		return heap.toString();
	}
}
