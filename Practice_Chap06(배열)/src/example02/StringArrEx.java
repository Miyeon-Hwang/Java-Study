package example02;

public class StringArrEx {
	public static void main(String[] args) {
		// String 배열 (Class 객체 배열)
		// 메모리 구조는 2차원 배열과 동일
		String[] str = new String[] { "asdf", "qewr" };
		
		System.out.println(str);
		// 복습하자면, 출력스트림에 참조변수를 넣으면 Object toString()의 결과로 주소값 출력
		// 그래서 2차원 배열이면 주소값을 리턴했지만
		// String에서 toString()이 오버라이딩 되어있기 때문에 주소값이 아닌 string 값이 리턴됨
		System.out.println(str[0]);
		
		// 향상된 for 문
		for (String s : str) {
			System.out.println(s);
		}
	}

}
