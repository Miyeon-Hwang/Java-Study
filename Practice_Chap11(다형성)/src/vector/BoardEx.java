package vector;

import java.awt.BorderLayout;
import java.util.Vector;

import polymorphismUsage.Computer;
import polymorphismUsage.TV;

public class BoardEx {
	
	public static void main(String[] args) {
		
		// 1. Vector (여기서는 기본만. 추후에 generic type 할 때 자세히)
		// 동적배열이다
		Vector vec = new Vector();
		
		System.out.println("용량 : " + vec.capacity());
		System.out.println("현재 사이즈 : " + vec.size());
		
		for (int i = 1; i < 15; i++) {
			vec.add(new Board("제목" + i, "내용" + i, "저자" + i));	
		}
		
		System.out.println("용량 : " + vec.capacity());
		System.out.println("현재 사이즈 : " + vec.size());
		
		Board b = (Board)vec.get(4);
		b.show();
		
		vec.remove(4);
		
		b = (Board)vec.get(4);
		b.show();
		
		System.out.println("용량 : " + vec.capacity());
		System.out.println("현재 사이즈 : " + vec.size());
	
		
		// 모든 타입의 객체를 저장할 수 있다.
		vec.add(new TV());
		vec.add(new Computer());
		
		System.out.println("용량 : " + vec.capacity());
		System.out.println("현재 사이즈 : " + vec.size());

	}

}
