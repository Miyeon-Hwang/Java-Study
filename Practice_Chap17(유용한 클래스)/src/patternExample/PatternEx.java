package patternExample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {
	
	// matches(), matcher()
	
	public static void main(String[] args) {
		
		String phone = "(010|02)-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(phone, "010-1234-1234"));
		System.out.println(Pattern.matches(phone, "02-124-4567"));
		
		System.out.println("================================");
	
		String email = "\\w+@\\w+(\\.\\w+){1,2}";
		System.out.println(Pattern.matches(email, "adsf123@adf.com"));
		System.out.println(Pattern.matches(email, "adsf123@adf.co.kr"));
		System.out.println(Pattern.matches(email, "adsf123@adf.co.kr.kr"));
	
		
		System.out.println("==============================");
		
		String[] data = {"cAA", "aaa","acc","ca","zdf","cabB","cabc","ewr"};
		Pattern patt = Pattern.compile("c[a-zA-Z]*"); // c로 시작하는 영단어
		Vector<String> res = new Vector<String>();
		for (String str: data) {
			Matcher m = patt.matcher(str);
			if (m.matches()) {
				res.add(str);
			}
		}
		System.out.println(res.toString());
	}

}
