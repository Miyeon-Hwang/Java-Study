package objectHashcode;

import java.util.HashSet;

public class PersonEx {
	
	public static void main(String[] args) {
		
		// HashSet은 hashcode를 기준으로 중복을 허용하지 않는 자료구조 (자세한 건 나중 강의에서)
		// 중복 확인 과정 : hashcode 같은지 확인 > 같다면 equals() 확인 (이 두 단계를 통과해야 같은 값으로 인식함) 
		HashSet hashSet = new HashSet();
		
		String str1 = new String("가");
		String str2 = new String("가");
		System.out.println(str1.hashCode()); // String 클래스에서는 주소가 아닌 값을 기준으로 hashcode를 얻도록 오버라이딩 되어있음.
		System.out.println(str2.hashCode());
		
		hashSet.add(str1);
		hashSet.add(str2);
		System.out.println(hashSet.size()); // str1, str2 hashcode가 같고 equals()도 논리적 동등으로 오버라이딩이 되어있기때문에 같은 객체로 인식하여 한번만 추가됨.
		hashSet.clear();
		
		// equals()만 오버라이딩된 사용자 정의 클래스
		Person per1 = new Person("홍길동");
		Person per2 = new Person("홍길동");
		System.out.println(per1.hashCode()); // Person에는 오버라이딩 되어있지 않기때문에 주소값을 기준으로 인스턴스마다 다른 hashcode가 리턴된 것
		System.out.println(per2.hashCode());
		
		hashSet.add(per1);
		hashSet.add(per2);
		System.out.println(hashSet.size()); // hashcode가 다르니 equals() 비교까지 가지도 않고 다른객체로 인식해고 둘다 추가해버림
		hashSet.clear();
		
		// equals(), hashcode() 둘 다 오버라이딩한 사용자 정의 클래스
		Person2 per3 = new Person2("김연아");
		Person2 per4 = new Person2("김연아");
		System.out.println(per3.hashCode());
		System.out.println(per4.hashCode());
		
		hashSet.add(per3);
		hashSet.add(per4);
		System.out.println(hashSet.size()); // 한번만 추가! (equals까지 확인한 것 로그 출력됨)
	}

}
