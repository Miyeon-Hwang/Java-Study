package vector;

import java.awt.BorderLayout;
import java.util.Vector;

import polymorphismUsage.Computer;
import polymorphismUsage.TV;

public class BoardEx {
	
	public static void main(String[] args) {
		
		// 1. Vector (���⼭�� �⺻��. ���Ŀ� generic type �� �� �ڼ���)
		// �����迭�̴�
		Vector vec = new Vector();
		
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("���� ������ : " + vec.size());
		
		for (int i = 1; i < 15; i++) {
			vec.add(new Board("����" + i, "����" + i, "����" + i));	
		}
		
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("���� ������ : " + vec.size());
		
		Board b = (Board)vec.get(4);
		b.show();
		
		vec.remove(4);
		
		b = (Board)vec.get(4);
		b.show();
		
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("���� ������ : " + vec.size());
	
		
		// ��� Ÿ���� ��ü�� ������ �� �ִ�.
		vec.add(new TV());
		vec.add(new Computer());
		
		System.out.println("�뷮 : " + vec.capacity());
		System.out.println("���� ������ : " + vec.size());

	}

}
