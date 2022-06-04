package dateExample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		// Calendar 클래스는 싱글톤 객체를 가져와서 사용
		// 기본적으로 현재 날짜와 시간 정보를 출력
		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); // 0부터 시작
		System.out.println("올해의 몇번째 주? " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 요일 리턴(일요일이 1)
		int day = today.get(Calendar.DAY_OF_WEEK);
		String strday = null;
		switch (day) {
		case Calendar.SUNDAY:
			strday = "SUNDAY";
			break;
		case Calendar.MONDAY:
			strday = "MONDAY";
			break;
		case Calendar.TUESDAY:
			strday = "TUESDAY";
			break;
		case Calendar.WEDNESDAY:
			strday = "WEDNESDAY";
			break;
		case Calendar.THURSDAY:
			strday = "THURSDAY";
			break;
		case Calendar.FRIDAY:
			strday = "FRIDAY";
			break;
		case Calendar.SATURDAY:
			strday = "SATURDAY";
			break;
		}
		System.out.println(strday);
		
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1995, 05, 15);  // 원하는 날짜로 설정할 수 있음
		
		long diff = Calendar.getInstance().getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff);
		
	}

}
