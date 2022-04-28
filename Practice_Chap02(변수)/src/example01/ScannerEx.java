package example01;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		// Scanner : 입력을 받기 위한 class, 입력스트림
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한자리를 입력 : ");
//		int input = sc.nextInt();
//		System.out.println("사용자로부터 입력받은 숫자 : " +  input);
//		
//		System.out.print("실수를 입력 : ");
//		double input2 = sc.nextDouble();
//		System.out.println("사용자로부터 입력받은 숫자 : " +  input2);
//		
//		System.out.print("문자열을 입력 : ");
//		String input3 = sc.next(); // next() => 공백을 기준으로 문자열입력을 받음 => 단어 입력받을때 사용
//		System.out.println("사용자로부터 입력받은 문자열 : " +  input3);
//		
//		System.out.print("문자열을 입력 : ");
//		String input4 = sc.nextLine(); // nextLint() => 엔터를 기준으로 한 줄을 받겠다
//		System.out.println("사용자로부터 입력받은 문자열 : " +  input4);

		System.out.print("문자열로 숫자를 입력 : ");
		String num = sc.nextLine();
		//int temp = 100 + num; // error
		int temp = 100 + Integer.parseInt(num);
		System.out.println("사용자로부터 입력받은 숫자 : " +  temp);
		
		
		sc.close(); // 자원(Resource, 키보드 마우스 등)은 사용하고 나서 반드시 닫아줘야 한다. 다른데서 접근할 수 있도록
	}

}
