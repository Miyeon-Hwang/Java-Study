package anonymous;

public class SoundEx {
	
	public static void main(String[] args) {
		
		// ����Ŭ���� (anonymous class)
		// ���⼱ �������̽��ϱ� �͸�����ü��� ��(����Ŭ������ �Ǹ� �͸��ڼհ�ü)
		Soundable s = new Soundable() {
			
			int num = 10;
			
			public void innerMethod() {
				System.out.println(this.num);
				System.out.println("�͸�����ü ���ο����� ��밡���� �޼���");
			}
			
			@Override
			public void sound() {
				System.out.println("�͸�����ü");
				innerMethod();
			}
		};
		
		//s.innerMethoud(); // �ٺ��� ���� �ʴ� �޼��带 ȣ���ϹǷ� ����
		s.sound();
	}

}
