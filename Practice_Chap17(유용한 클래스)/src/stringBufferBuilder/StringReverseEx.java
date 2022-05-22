package stringBufferBuilder;

public class StringReverseEx {
	
	public static void main(String[] args) {
		// String 클래스에는 reverse 메소드 없음
		// StringBuilder 클래스의 reverse 메소드를 사용
		String str1 = "안녕하세요";
		System.out.println(Reverse(str1));
		
		
	}
	
	public static String Reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
