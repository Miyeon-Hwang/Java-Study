package example01;

public class AccuracyEx {
	public static void main(String[] args) {
		// CPU ������ ������ Ȯ���غ���
		
		int apple = 1;
		double unit = 0.1;
		int num = 7;
		
		double result = apple - (unit * num);
		System.out.println(result);
		
		// �� 0.3�� �ȳ�����??
		
		System.out.println(unit * num);
		// �� ���� 0.7�� �ƴϰ� 0.7000000000000001 �� ����
		// ����ÿ� double�� �ڵ�ĳ���õǸ鼭 �Ǽ� ǥ�� ������ �а� �������鼭 ����� �����ϴ°Ŷ� �ٸ��� ������ �����..? 
	}

}
