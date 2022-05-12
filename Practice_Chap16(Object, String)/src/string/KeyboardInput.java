package string;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class KeyboardInput {
	
	public static void main(String[] args) {
		
		// 1. System.in.read
		byte[] bytes = new byte[100]; // 0으로 자동 초기화
		
		System.out.println("입력 : ");
		int numBytes = 0;
		try {
			// 매개변수로 넘겨준 배열에 input stream을 저장하는 메서드. 입력받은 바이트 수 리턴(캐리지리턴 포함)
			// 인코딩은 이클립스 디폴트인 EUC-KR로 되는 듯(numBytes보면 한글을 2byte로 받음 + 뒤에서 UTF-8로 bytes를 인코딩하니 한글이 깨지네) 
			numBytes = System.in.read(bytes); 
			System.out.println("입력한 바이트 수 : " + numBytes);
			
			// Byte로 받은 입력을 문자열로 디코딩할 때 UTF-8, EUC-KR 등으로 정해줄 수있음(이클립스 인코딩 디폴트는 EUC-KR 임)
			String str = new String(bytes, 0, numBytes - 2, "EUC-KR"); // -2 해주는 이유는 캐리지리턴 제외
			//String str = new String(bytes, 0, numBytes - 2, "UTF-8"); // bytes를 UTF-8로 디코딩하면 한글이 깨짐. 인풋을 bytes로 받을 때 이클립스 디폴트인 EUC-KR로 인코딩되는데 이를 UTF-8로 디코딩하려하니 깨지는것
			System.out.println(str);
			
			// UTF-8 : 영어,숫자 등 아스키값은 1byte, 한글 3byte
			// EUC-KR : 영어,숫자 등 아스키값은 1byte, 한글 2byte
			byte[] b = str.getBytes(); // 디폴트인 "EUC-KR"로 인코딩
			//byte[] b = str.getBytes("UTF-8"); 
			System.out.println(b.length);
			
			
			// @ 인코딩, 디코딩에서 charset을 동일하게 가져가야 한글이 안깨짐!
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// 2. Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.println("스캐너 입력 : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		byte[] b;
		try {
			b = str.getBytes("utf-8");
			System.out.println(Arrays.toString(b)); // byte니까 유니코드를 반환하는데 오버플로우때문에 한글은 이상한값 반환됨.
		
			char[] ch = str.toCharArray(); // toCharArray()로 char 배열로 받아서 출력하면 문자그대로 나옴
			System.out.println(ch);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
