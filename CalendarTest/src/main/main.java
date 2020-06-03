package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class main {
	public static void main(String[] args) {
		/*
		
			Calendar	->	year,month, day 구할 수 있다.
			Date도 있긴한데 너무 구짐;
		
		
		 */
		Calendar cal1 = new GregorianCalendar();
		
		Calendar cal2 = Calendar.getInstance();
		
		//getter
		int year = cal2.get(Calendar.YEAR);
		int month = cal2.get(Calendar.MONTH) + 1; // 0~11 이라 +1 필요
		int day = cal2.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		//setter
		cal2.set(Calendar.YEAR, 2021);
		cal2.set(Calendar.MONTH, Calendar.FEBRUARY); // 숫자도 가능하지만 문자도 가능
		cal2.set(Calendar.DATE, 17);
		
		year = cal2.get(Calendar.YEAR);
		month = cal2.get(Calendar.MONTH) + 1;
		day = cal2.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		System.out.println(Calendar.AUGUST);
		
		int weekday = cal2.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday); // 1~7 일~토
		
		switch(weekday) {
			case 4:
				System.out.println("수욜");
				break;
		}
		
		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 6-1);
		
		int lastday = cal2.getActualMaximum(Calendar.DAY_OF_MONTH); // 현재 설정된 년, 달의 마지막 날짜.
		System.out.println("LAST DAY : "+lastday);
		
		
		//캘린더 제작~
			//위의 빈칸 . 1일로 설정. 요일도 구해야 함.
		cal2.set(Calendar.DATE, 1);
		weekday = cal2.get(Calendar.DAY_OF_WEEK);
		int up = (weekday - 1)%7;
		System.out.println("윗줄 빈칸 수 : " + up);
		
			//아랫줄 빈칸. 말일로 설정. 요일도 구해야 함.
		lastday = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("LAST DAY : "+lastday);
		cal2.set(Calendar.DATE, lastday);
		weekday = cal2.get(Calendar.DAY_OF_WEEK);
		int down = 7-weekday;
		System.out.println("밑줄 빈칸 수 : "+down);
		
			//달력 출력
		year = 2020;
		month = 6;
		cal2.set(Calendar.YEAR, year);
		cal2.set(Calendar.MONTH, month-1);
		cal2.set(Calendar.DATE, 1); // 달력 뿌릴 때 날짜는 꼭 1
		
		int _startday = cal2.get(Calendar.DAY_OF_WEEK);
		int _lastday = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("=========================================================");
		String week_day = "일월화수목금토";
		for(int i=0;i<week_day.length();i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		System.out.println("=========================================================");
		
			//윗쪽 빈칸 출력
		for(int i=1;i<_startday;i++) {
			System.out.print("*\t");
		}
			//날짜 입력
		for(int i=0;i<_lastday;i++) {
			System.out.print(_date+i+"\t");
			
			if((_date+i + _startday - 1)%7==0) {
				System.out.println();
			}
		}
		
			//아랫쪽 빈칸 출력
		for(int i=0;i<(7-(_startday+_lastday-1)%7);i++) {
			System.out.print("*\t");
		}
		System.out.println();
		System.out.println("=========================================================");
	}
}