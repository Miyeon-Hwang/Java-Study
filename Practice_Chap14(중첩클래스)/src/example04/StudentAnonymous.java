package example04;

public class StudentAnonymous {
	
	// 1. Ŭ������ �ʵ��� �ʱⰪ���� �͸�ü ���
	Student stu1 = new Student("ȫ�浿") {
		
		public void goSchool() {
			System.out.println(this.name + "�� ��մϴ�");
		}
		
		@Override
		public void wake() {
			System.out.println("�ʵ��� �ʱⰪ ���·� ������� �͸��ڼ� ��ü");
			System.out.println(this.name + "�� 9�ÿ� �Ͼ�ϴ�");
			this.goSchool();
		};
	};
	
	// 2. �޼����� ���ú����� �͸�ü ���
	public void method() {
		Student lstu = new Student("�迬��") {
			
			public void goSkate() {
				System.out.println(this.name + "�� ������Ʈ�����Ϸ� ���ϴ�.");
			}
			
			@Override
			public void wake() {
				System.out.println("�޼����� ���ú����� ������� �͸��ڼ� ��ü");
				super.wake();
				goSkate();
			}
		};
		
		lstu.wake();
	}
	
	// 3. �޼����� �Ű����� ������ �͸�ü ���
	public void method2(Student student) {
		student.wake();
	}

}
