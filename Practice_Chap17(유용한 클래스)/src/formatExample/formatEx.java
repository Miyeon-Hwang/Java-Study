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
		
		df = new DecimalFormat("000000000.00"); // 0은 빈 자리를 0으로 표시해줌
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
		
		sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일 a hh:mm");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(date));		
		
	}
}
