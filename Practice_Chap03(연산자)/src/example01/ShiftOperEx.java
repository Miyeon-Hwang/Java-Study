package example01;

public class ShiftOperEx {
	
	public static void main(String[] args) {
		
		// shift ������ : <<(left shift), >>(right shift) => ó���ӵ��� ����!(�׷��� �о߿��� ���� ���)
		int a = 7;
		int b = 3;
		
		System.out.println(a + " << " + b + " : " + (a << b)); // 2^b ���ϴ� ��
		System.out.println(a + " >> " + b + " : " + (a >> b)); // 2^b���� ������ �� => ���� ����
		
		// �˰��� ���� ���� �� shift �����̶� ��Ʈ �������� �κ����� ���ϴ°� �־��µ�...
		
	}
}
