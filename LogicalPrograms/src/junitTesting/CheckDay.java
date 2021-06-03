package junitTesting;
import java.util.Scanner;
import util.DayOfWeek;
public class CheckDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in order of Month Day Year");
		int month=sc.nextInt();
		int date=sc.nextInt();
		int year=sc.nextInt();
		sc.close();
		
		int dayOfWeek=DayOfWeek.dayOfWeek(month, date, year);
		switch(dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Fridayday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid dates");
		}
	}

}
