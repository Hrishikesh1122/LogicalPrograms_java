package util;

public class DayOfWeek {
	public static int dayOfWeek(int month,int date,int year) {
		int Yo=year-(14-month)/12;
		int X=Yo+(Yo/4)-(Yo/100)+(Yo/400);
		int Mo=month+12*((14-month)/12)-2;
		int Do=(date+X+31*Mo/12)%7;
		
		return Do;
	}
	
}
