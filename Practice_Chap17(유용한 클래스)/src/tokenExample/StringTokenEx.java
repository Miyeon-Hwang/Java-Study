package tokenExample;

import java.util.StringTokenizer;

public class StringTokenEx {
	
	public static void main(String[] args) {
		
		String str = "baby    cat dog";
		
		String[] res1 = str.split(" ");
		for (String s : res1) {
			System.out.println(s);  // 공백 다 출력
		}
		
		System.out.println("=========================");
		StringTokenizer token = new StringTokenizer(str, " ");
		while (token.hasMoreTokens()) {
			System.out.println("남은토큰수 : " + token.countTokens());
			System.out.println(token.nextToken());
		}
		
		
		
		// 정규표현식으로 여러개의 구분자 제시
		System.out.println();
		
		str = "as#df/sbf%addfa/#";
		
		res1 = str.split("[/#%]"); 
		for (String s : res1) {
			System.out.println(s);  // 공백 다 출력
		}
		
		token = new StringTokenizer(str, "[/#%]");
		while (token.hasMoreTokens()) {
			System.out.println("남은토큰수 : " + token.countTokens());
			System.out.println(token.nextToken());
		}
		
		
	}

}
