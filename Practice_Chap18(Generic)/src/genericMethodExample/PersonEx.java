package genericMethodExample;

public class PersonEx {
	
	public static void main(String[] args) {
		
		Person<Integer> p1 = Util.changing(100);
		System.out.println(p1.getT());
		
		
		System.out.println(Util.compare(100, 200));
		System.out.println(Util.compare(100.22, 100));
		//Util.compare("���", "����"); // Number Ŭ������ ����Ŭ������ �ƴϱ� ������ ������ ����
	}

}
