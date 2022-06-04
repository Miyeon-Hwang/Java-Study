package dateExample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		// Calendar Ŭ������ �̱��� ��ü�� �����ͼ� ���
		// �⺻������ ���� ��¥�� �ð� ������ ���
		Calendar today = Calendar.getInstance();
		
		System.out.println(today);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); // 0���� ����
		System.out.println("������ ���° ��? " + today.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // ���� ����(�Ͽ����� 1)
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
		cal1.set(1995, 05, 15);  // ���ϴ� ��¥�� ������ �� ����
		
		long diff = Calendar.getInstance().getTimeInMillis() - today.getTimeInMillis();
		System.out.println(diff);
		
	}

}
