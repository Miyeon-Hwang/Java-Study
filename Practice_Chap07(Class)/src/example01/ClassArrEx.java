package example01;

class Test {
	int id;
}

public class ClassArrEx {
	
	public static void main(String[] args) {
		
		// 객체 배열이 메모리 상에 어떻게 할당되는가?
		// 기본적으로는 2차원 배열과 유사함.
		
		// 1. stack 영역에 tests 변수, 즉 주소를 저장한 4 byte 메모리 할당
		// 2. heap 영역에 10 개의 Test 객체의 주소를 저장할 메모리 할당(4byte * 10)
		Test[] tests = new Test[10];
		
		System.out.println(tests);
		for (int i=0; i < tests.length; i++) {
			System.out.println(i + "번째 Test 객체 주소 값 : " + tests[i]); // 메모리만 할당되고 Test 객체에 대한 주소값을 저장되지 않았기 때문에 null이 리턴됨.
		}
		
		for (int i=0; i < tests.length; i++) {
			// 3. Test 객체를 하나씩 생성하고 그 주소를 2번에서 할당한 메모리에 하나씩 연결해주는 것
			tests[i] = new Test();
			System.out.println(i +  "번째 Test 객체 주소 값 : " + tests[i]);
		}
	}
}
