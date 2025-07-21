package p385;
import java.util.*;
public class FindDayOfWeekEx {
	public static String findDayOfWeek(int year, int month, int dayOfMonth) {
		Calendar cal = Calendar.getInstance(); //Calendar 객체 생성
		
		if(month<1 || month>12)
			return "입력 오류! 달의 범위는 1~12입니다.";
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if(dayOfMonth>maxDay)
			return "입력오류 !"+year+"년 "+month+"월은 "+maxDay+"일까지입니다.";
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String res="";
		switch(dayOfWeek) {
		case 
		}
	}
}
