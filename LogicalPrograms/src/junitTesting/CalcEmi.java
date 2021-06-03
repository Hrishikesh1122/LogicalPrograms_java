package junitTesting;
import util.Emi;
import java.util.Scanner;
public class CalcEmi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter in order of Principle amount,No. of years,Rate of intrest ");
		double principle=sc.nextDouble();
		int years=sc.nextInt();
		double roi=sc.nextDouble();
		System.out.println("Monthly installment is :"+Emi.monthlyPayment(principle, years, roi)+" Rs.");
		sc.close();
	}

}
