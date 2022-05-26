package submit;

import java.util.Calendar;

public class Test0526_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int todayWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		Week weekday = null;
		
		switch (todayWeek) {
		
		case 1: 
			weekday = Week.일요일;
		break;
		
		case 2:
			weekday = Week.월요일;
		break;
		
		case 3:
			weekday = Week.화요일;
		break;
		
		case 4:
			weekday = Week.수요일;
		break;
		
		case 5:
			weekday = Week.목요일;
		break;
		
		case 6:
			weekday = Week.금요일;
		break;
		
		case 7:
			weekday = Week.토요일;
		}

		System.out.println("오늘은 " + weekday + "일입니다.");
		
	}

}
