package submit;

import java.util.Calendar;

public class Test0526_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int todayWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		Week weekday = null;
		
		switch (todayWeek) {
		
		case 1: 
			weekday = Week.�Ͽ���;
		break;
		
		case 2:
			weekday = Week.������;
		break;
		
		case 3:
			weekday = Week.ȭ����;
		break;
		
		case 4:
			weekday = Week.������;
		break;
		
		case 5:
			weekday = Week.�����;
		break;
		
		case 6:
			weekday = Week.�ݿ���;
		break;
		
		case 7:
			weekday = Week.�����;
		}

		System.out.println("������ " + weekday + "���Դϴ�.");
		
	}

}
