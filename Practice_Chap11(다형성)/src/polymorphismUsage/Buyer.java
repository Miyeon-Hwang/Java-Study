package polymorphismUsage;

public class Buyer {
	
	private int money = 1000;
	private int bonusPoint = 0;
	
	// �Ű������� Product�� �������ν� �̸� ����ϴ� �ڼ�Ŭ������ �Ű������� �� ���� �� ����. �������� ������ �ڼ�Ŭ���� ���� buy �Լ��� �ۼ����־����
	// ������ ���� => �ڵ��� ����. ���� ���յ�. �������� ��
	public void buy(Product p) {
		if (this.money >= p.price) {
			this.money -= p.price;
			this.bonusPoint += (int)(p.price/10);
			System.out.println(p.price + "������ ���� �Ϸ�");
		}
		else {
			System.out.println("�ܾ� �������� ���� ����");
		}

	}
	
	public void info() {
		System.out.println("���� �� : " + this.money);
		System.out.println("���ʽ� ����Ʈ : " + this.bonusPoint);
	}

}
