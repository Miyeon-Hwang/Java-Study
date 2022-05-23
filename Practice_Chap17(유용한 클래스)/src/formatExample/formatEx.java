package formatExample;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class formatEx {
	
	public static void main(String[] args) {
		
		// DecimalFormat class
		double num = 12345.123456;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000000000.00"); // 0�� �� �ڸ��� 0���� ǥ������
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#########.##");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));
		
		
		System.out.println();
		// SimpleDateFormat class
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy�� M�� d�� E���� a hh:mm");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("������ D��° ��");
		System.out.println(sdf.format(date));		
		
	}
}
