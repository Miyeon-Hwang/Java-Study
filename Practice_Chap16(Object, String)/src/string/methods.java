package string;

import java.io.UnsupportedEncodingException;

public class methods {
	
	public static void main(String[] args) {
		
		// 1. charAt()
		String ssn = "940105-2345678";
		
		if (ssn.charAt(7) == '2') {
			System.out.println("female");
		}
		else if (ssn.charAt(7) == '1') {
			System.out.println("male");
		}
		
		System.out.println("======================================");
		// 2. equals()
		String str1 = new String("홍길동");
		String str2 = "홍길동";
		String str3 = "홍길동";
		
		// == 는 주소비교
		System.out.println(str1 == str2); 
		System.out.println(str2 == str3); // 같은 리터럴은 같은 주소를 참조(JVM이 같은 리터럴 값이면 해당 객체주소를 참조하도록 함)
		
		// String 클래스의 equals()는 값을 비교하도록 오버라이딩되어있음
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("======================================");
		// 3. getBytes()
		String s1 = "안녕하세요";
		try {
			// 인코딩
			byte[] byte1 = s1.getBytes("EUC-KR");
			System.out.println(byte1.length); // EUC-KR은 한글 2byte
			
			byte[] byte2 = s1.getBytes("UTF-8");
			System.out.println(byte2.length); // UTF-8은 한글 3byte
			
			// 디코딩
			System.out.println(new String(byte1)); // java는 디폴트가 EUC-KR
			System.out.println(new String(byte2)); // 인코딩, 디코딩 charSet을 맞춰줘야함
			System.out.println(new String(byte2, "UTF-8")); 
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("======================================");
		// 4. indexOf()
		String s2 = "자바 공부 열심히 합시다 공부";
		System.out.println("찾은 문자열 시작 인덱스 : " + s2.indexOf("공부"));
		System.out.println(s2.indexOf("바보")); // 찾을 수 없는 문자열이면 -1 리턴
		System.out.println(s2.lastIndexOf("공부"));
		
		
		System.out.println("======================================");
		// 5. replace(), subString() => 새로운 String 객체 리턴
		String s = "안녕 자바 공부 강의";
		System.out.println(s.replace("자바", "공부"));
		System.out.println(s);
		
		String num = "01012345678";
		System.out.println(num.substring(5, 8));
		
		
		System.out.println("======================================");
		// 6. valueOf()
		String ss = String.valueOf(false);
		System.out.println(ss);
		System.out.println(String.valueOf(12.555));
		
		
		
	}

}
