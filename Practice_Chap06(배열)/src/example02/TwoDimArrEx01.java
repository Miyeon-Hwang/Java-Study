package example02;

public class TwoDimArrEx01 {
	
	public static void main(String[] args) {
		
		int[][] score = new int[][] { 
										{100, 100, 100}, 
										{50, 50, 50}, 
										{10, 20, 30},
										{1, 2, 3}
									};
									
		
		// 1. 2���� �迭������ 2���� �迭�� �ּ�, 1���� �迭�� �ּҸ� ������!!!
		System.out.println("2���� �迭�� �ּ� : " + score);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(i +"�� 1���� �迭�� �ּ� : " + score[i]); // �� ���� �ּҰ�
		}
		
		
		// 2. ���� for ��
		// collection framework ��ü�� ������ �� �����ϰ� ���
		for (int[] arr : score) {
			System.out.println(arr);
		}
		
		for (int val : score[2]) {
			System.out.println(val);
		}
									
	}

}
