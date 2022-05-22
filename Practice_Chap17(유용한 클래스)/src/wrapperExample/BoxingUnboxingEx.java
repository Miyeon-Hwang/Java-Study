package wrapperExample;

import java.util.List;
import java.util.Vector;

public class BoxingUnboxingEx {

	public static void main(String[] args) {
		
		// 1. Boxing
		Integer i1 = 100; // 사실 new Integer(100); 이나 컴파일시 자동으로 박싱
		Integer i2 = Integer.valueOf("100");
		
		// 2. Unboxing
		int n1 = i1; // i1.intValue() 없어도 자동으로 언박싱
		int n2 = i2.intValue(); // 함수가 불러지면 객체화 된 것
		
		
		// collection framework에의 사용
		List<Integer> list = new Vector<Integer>();
		list.add(n1); // 자동으로 박싱해서 객체를 add하게 됨
		list.add(i2);
		list.add(600);
		System.out.println(list);
		
		int o = list.get(0); // list의 요소는 Integer 객체이지만 자동으로 언박싱 해줌
		
		
		
		
		
	}
}
