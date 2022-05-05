package example02;

class Block {
	
	static int staticNum = 0;
	int instanceNum = 0;
	
	// 1. �ν��Ͻ� �ʱ�ȭ��, �ν��Ͻ��� ������ ������ ȣ��(new). �޸� �������� �ö�
	// �ֻ��? ������! ������ �ʱ�ȭ �ڵ带 �ʱ�ȭ���� �ۼ����ָ� ������ ������.
	{
		System.out.println();
		staticNum++;
		instanceNum = staticNum;
		System.out.printf("�ν��Ͻ� �ʱ�ȭ�� �����. static = %d, instance = %d\n", staticNum, instanceNum);
	}
	
	// 2. �����ʱ�ȭ ��, �� �ѹ� �����. �޸� Ŭ���� ������ �ö�
	static {
		System.out.println("���� �ʱ�ȭ�� �����");
	}
	
	public Block() {
		System.out.println("������ ȣ��");
	}
}

public class BlockEx {

	// 3. �ʱ�ȭ ����
	// Ŭ���� ���� : ����Ÿ�Կ� ���� �⺻�� > ����� �ʱ�ȭ > Ŭ����(����) �ʱ�ȭ ��
	// �ν��Ͻ� ���� : ����Ÿ�Կ� ���� �⺻�� > ����� �ʱ�ȭ > �ν��Ͻ� �ʱ�ȭ �� > ������
	public static void main(String[] args) {
		Block b1 = new Block();
		System.out.println("Block.staticNum : " + Block.staticNum + ", b1.instanceNum : " + b1.instanceNum);
		
		Block b2 = new Block();
		
		System.out.println("Block.staticNum : " + Block.staticNum + ", b1.instanceNum : " + b1.instanceNum);
		System.out.println("Block.staticNum : " + Block.staticNum + ", b2.instanceNum : " + b2.instanceNum);
	}

}
