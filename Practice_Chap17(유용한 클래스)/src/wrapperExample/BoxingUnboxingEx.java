package wrapperExample;

import java.util.List;
import java.util.Vector;

public class BoxingUnboxingEx {

	public static void main(String[] args) {
		
		// 1. Boxing
		Integer i1 = 100; // ��� new Integer(100); �̳� �����Ͻ� �ڵ����� �ڽ�
		Integer i2 = Integer.valueOf("100");
		
		// 2. Unboxing
		int n1 = i1; // i1.intValue() ��� �ڵ����� ��ڽ�
		int n2 = i2.intValue(); // �Լ��� �ҷ����� ��üȭ �� ��
		
		
		// collection framework���� ���
		List<Integer> list = new Vector<Integer>();
		list.add(n1); // �ڵ����� �ڽ��ؼ� ��ü�� add�ϰ� ��
		list.add(i2);
		list.add(600);
		System.out.println(list);
		
		int o = list.get(0); // list�� ��Ҵ� Integer ��ü������ �ڵ����� ��ڽ� ����
		
		
		
		
		
	}
}
