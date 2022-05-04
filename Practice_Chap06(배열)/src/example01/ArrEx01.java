package example01;

import java.util.Arrays;

public class ArrEx01 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		
		char[] charr = new char[] {'a', 'b', 'c'};
		
		
		// Arrays : 배열 utility library
		System.out.println(Arrays.toString(charr));
		System.out.println(Arrays.toString(arr)); // 배열을 string으로 리턴해줌
		
		// 기본적으로 출력스트림에 참조변수(배열, class 객체 등)를 넣으면
		// 자동으로 toString()의 결과값(타입@16진수주소)을 호출하는데
		// char 배열에서만 좀 다름(강사가 유니코드를 사용하기 때문이라고 추정한다고 함.. 근데 그럼 왜???)
		System.out.println(arr); // toString()의 결과값인 주소값 리턴
		System.out.println(arr.toString()); // 주소값 리턴
		System.out.println(charr);
		System.out.println(charr.toString()); // 주소값 리턴
		
	}
}
