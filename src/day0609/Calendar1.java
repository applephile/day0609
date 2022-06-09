package day0609;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String strWeek = null;
		
		switch(week) {
		case 1://case Calendar.MONDAY:
			strWeek = "일요일";
			System.out.println("일");
			break;
		case 2:
			strWeek = "월요일";
			System.out.println("월");
			break;
		case 3:
			strWeek = "화요일";
			System.out.println("화");
			break;
		case 4:
			strWeek = "수요일";
			System.out.println("수");
			break;
		case 5:
			strWeek = "목요일";
			System.out.println("목");
			break;
		case 6:
			strWeek = "금요일";
			System.out.println("금");
			break;
		case 7:
			strWeek = "토요일";
			System.out.println("토");
			break;
		}
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) 
			System.out.println("오전");
		 else 
			System.out.println("오후");
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + "시 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초");
		
		
	}

}
