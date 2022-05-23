package systemExample;

import java.util.Properties;

public class GetPropertyEx {
	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("user.name"));
		
		// Properties 클래스는 Map계열 컬렉션(key-value)
		// 시스템 속성 정보 한번에 받기
		Properties properties = System.getProperties();
		for(Object k : properties.keySet()) {
			System.out.print(k + " : ");
			System.out.println(properties.get(k));
		}
	}
}
