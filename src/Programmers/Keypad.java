package Programmers;

/*
 * 2020 īī�� ���Ͻ� - Ű�е� ������
 * Ŭ���� �����Ͽ� ��ǥ ���� �� �Ÿ� ���
 * 
 * */
public class Keypad {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		String result = "";
		
		Hand left = new Hand(3, 0);
		Hand right = new Hand(3, 2);
		Hand target = new Hand(0, 0);
		
		for(int n : numbers) {
			switch(n) {
			case 1:
			case 4:
			case 7:
				result += "L";
				left.setHand(n / 3, 0);
				break;
			case 3:
			case 6:
			case 9:
				result += "R";
				right.setHand((n / 3) - 1, 2);
				break;
			case 2:
			case 5:
			case 8:
			case 0:
				if(n == 0) n = 11;
				target.setHand(n / 3, 1); // ��ǥ ��ġ
				int leftD = Math.abs(left.row - target.row) + Math.abs(left.col - target.col); // ���� �հ��� �Ÿ�
				int rightD = Math.abs(right.row - target.row) + Math.abs(right.col - target.col); // ������ �հ��� �Ÿ�
				System.out.println(leftD + "," + rightD);
				if(leftD == rightD) { // �Ÿ��� ���� ��� �޼����� ���������� ���ο� ���� �Ǻ�
					if(hand.equals("left")) {
						result += "L";
						left.setHand(target.row, target.col);
					} else {
						result += "R";
						right.setHand(target.row, target.col);
					}
				} else if (leftD < rightD) { // ���� �հ����� ����� ���
					result += "L";
					left.setHand(target.row, target.col);
				} else { // ������ �հ����� ����� ���
					result += "R";
					right.setHand(target.row, target.col);
				}
			}
		}
		
		System.out.println(result);
	}
}

class Hand {
	int row;
	int col;
	
	public Hand(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public void setHand(int row, int col) {
		this.row = row;
		this.col = col;
	}
}