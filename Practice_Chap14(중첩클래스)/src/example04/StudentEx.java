package example04;

public class StudentEx {
	
	public static void main(String[] args) {
		
		StudentAnonymous anony = new StudentAnonymous();
		anony.stu1.wake();
		
		System.out.println();
		anony.method();
		
		System.out.println();
		anony.method2(new Student("������") {
			
			public void goTraining() {
				System.out.println(this.name + "�� �Ʒ��Ϸ� ���ϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("�޼����� �Ű������� �͸�ü�� �����Ͽ� �ѱ�");
				super.wake();
				goTraining();
			}
		});
	}

}
