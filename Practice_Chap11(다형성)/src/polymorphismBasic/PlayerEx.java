package polymorphismBasic;

public class PlayerEx {
	
	public static void main(String[] args) {
		
		// 1. ������ ��� ���� ���
		// ��������� ���� ���������� Ÿ���� ����. ��, �ٺ��� ����� ����
		// ����޼���� �����ϰ��ִ� �ν��Ͻ� Ÿ���� ������ ����. ��, �ν��Ͻ����� �ش� ��� �޼��带 �������̵��ϰ��ִٸ� �ش� �޼��带 ȣ��. ������ �θ��� �޼��带 ȣ��
		Player p1 = new Player("�̵���", 30, 20, 60);
		p1.info();
		System.out.println();
		
		// ������ ����
		Player p2 = new Striker("�����", 30, 30, 80, 50);
		p2.info(); // Striker class���� �������̵��� info()�� ȣ���.
		//p2.getShoot(); // getShoot �޼���� Player���� ���� Striker���� �ִ� ���. p2�� �ٺ��� Player �̹Ƿ� shoot���� ������ �� ����. �θ�Ŭ���� getter�� ȣ�� ����
		System.out.println();
		
		Player p3 = new MidFielder("�̰���", 25, 50, 40, 80);
		p3.info(); // ���� �ڼ�Ŭ������ �������̵� �Ǿ������Ƿ� MidFielder�� info �޼��尡 ȣ���.
		System.out.println();
		
		Player p4 = new Defender("ȫ�浿", 30, 40, 20, 40);
		p4.info(); // Defender���� info �޼��尡 �������̵� �Ǿ����� �ʾƼ� player�� info�� ȣ����
		
		
		// 2. ������ ����ȯ
		System.out.println("==========================================");
		
		// Up-Casting -> ������ �� �ִ� ��� ���� �پ���.
		Player p5 = p2;
		p5.info();
		//p5.shoot() // p5�� �ٺ��� Player�̹Ƿ� Striker�� ����޼����� shoot�� ȣ���� �� ����. ������ ����
		
		System.out.println();
		// Down-Casting -> ������ �� �ִ� ����� �þ
		Striker s1 = (Striker)p5; // ����� ����ȯ �ʼ�!!!!
		s1.info();
		s1.shoot();
		
		//Defender d1 = (Defender)s1;  // ���� ��Ӱ��谡 �ƴϱ� ������ ���� ĳ���� �Ұ���! Defender, Striker�� ���� �θ�Ŭ������ ����� �� �� ���̿��� �ƹ� ���谡 ����!
		
		// 3. instanceof Ȱ��
		// ctrl + t : ���� ���õ� Ŭ������ ��Ӱ��踦 Ȯ���� �� �ִ� ����Ű
		System.out.println("===============================================");
		if (s1 instanceof Player) {
			System.out.println("s1 can be Player");
		}
		
		if (s1 instanceof Object) {
			System.out.println("s1 can be Object");
		}
		
	}

}
