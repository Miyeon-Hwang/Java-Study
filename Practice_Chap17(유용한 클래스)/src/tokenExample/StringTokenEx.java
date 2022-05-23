package tokenExample;

import java.util.StringTokenizer;

public class StringTokenEx {
	
	public static void main(String[] args) {
		
		String str = "baby    cat dog";
		
		String[] res1 = str.split(" ");
		for (String s : res1) {
			System.out.println(s);  // ���� �� ���
		}
		
		System.out.println("=========================");
		StringTokenizer token = new StringTokenizer(str, " ");
		while (token.hasMoreTokens()) {
			System.out.println("������ū�� : " + token.countTokens());
			System.out.println(token.nextToken());
		}
		
		
		
		// ����ǥ�������� �������� ������ ����
		System.out.println();
		
		str = "as#df/sbf%addfa/#";
		
		res1 = str.split("[/#%]"); 
		for (String s : res1) {
			System.out.println(s);  // ���� �� ���
		}
		
		token = new StringTokenizer(str, "[/#%]");
		while (token.hasMoreTokens()) {
			System.out.println("������ū�� : " + token.countTokens());
			System.out.println(token.nextToken());
		}
		
		
	}

}
