package Programmers;

import java.util.ArrayList;

//프로그래머스 level2-더 맵게 (ArrayList 사용)
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
		// 원소의 개수가 2개 미만일 경우
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

	// 1. 생성자
	public Heap(int[] arr) {
		heap = new ArrayList<Integer>();
		heap.add(0); // 0번째 인덱스 사용 X
		for(int i = 0; i < arr.length; i++)
			insert(arr[i]);
		
	}

	// 2. 삽입
	public void insert(int val) {
		heap.add(val);
		int idx = heap.size() - 1;
		while (idx > 1 && heap.get(idx / 2) > heap.get(idx)) { // 1) 루트 도달 2) 부모보다 작음 시 반복문 종료
			swap(idx, idx / 2); // 현재 노드와 부모 노드 바꾸기

			idx /= 2; // 부모 노드 인덱스 값으로 변경
		}
	}

	// 3. 삭제
	public int delete() {
		if (heap.size() - 1 < 1) {
			return 0;
		}

		int item = heap.get(1); // 루트 노드 꺼내기

		swap(1, heap.size() - 1); // 현재 노드와 루트 노드 바꾸기
		heap.remove(heap.size() - 1);
		
		int idx = 1;
		while ((idx * 2) < heap.size()) {
			int min = heap.get(idx * 2); // 왼쪽 자식 노드
			int minPos = idx * 2;

			if ((idx * 2 + 1) < heap.size() && min > heap.get(idx * 2 + 1)) { // 오른쪽 자식 노드가 있고 왼쪽 자식 노드보다 작을 때
				min = heap.get(idx * 2 + 1);
				minPos = idx * 2 + 1;
			}
			
			if(min > heap.get(idx))	// 부모 노드가 더 작으면 반복문 종료
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
