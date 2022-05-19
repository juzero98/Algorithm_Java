package Programmers;

/*
 * 2020 카카오 인턴십 - 키패드 누르기
 * 클래스 선언하여 좌표 설정 및 거리 계산
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
				target.setHand(n / 3, 1); // 목표 위치
				int leftD = Math.abs(left.row - target.row) + Math.abs(left.col - target.col); // 왼쪽 손가락 거리
				int rightD = Math.abs(right.row - target.row) + Math.abs(right.col - target.col); // 오른쪽 손가락 거리
				System.out.println(leftD + "," + rightD);
				if(leftD == rightD) { // 거리가 같을 경우 왼손잡이 오른손잡이 여부에 따라 판별
					if(hand.equals("left")) {
						result += "L";
						left.setHand(target.row, target.col);
					} else {
						result += "R";
						right.setHand(target.row, target.col);
					}
				} else if (leftD < rightD) { // 왼쪽 손가락이 가까울 경우
					result += "L";
					left.setHand(target.row, target.col);
				} else { // 오른쪽 손가락이 가까울 경우
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