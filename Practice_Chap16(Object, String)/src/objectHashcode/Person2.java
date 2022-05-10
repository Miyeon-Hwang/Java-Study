package objectHashcode;

public class Person2 {
	
	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (obj instanceof Person2) {
			Person2 person = (Person2)obj;
			if (this.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode(); // String���� hashcode�� ���� �������� �����ǵ��� �������̵� �Ǿ������ϱ�
		// ���� ���̱��� ���ؾ��Ѵٸ� �Ʒ��� ���� (hashcode�� ������ �̴ϱ�)
		// return this.name.hashcode() + this.age;
		// �Ǵ�, Objects.hash() Ȱ�� -> �Ű������� �Ѿ�� ��ü�� ������ ���� hash�� ��������
		// return Objects.hash(this.name, this.age);
	}
	

}
