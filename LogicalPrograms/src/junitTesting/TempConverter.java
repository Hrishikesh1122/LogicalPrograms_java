package junitTesting;
import java.util.Scanner;
import util.Temperture;
public class TempConverter {

	public static void main(String[] args) {
	//	Temperture t=new Temperture();
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter choice 1)Convert to degF 2)Convert to degC");
		choice=sc.nextInt();
		System.out.println("Enter temperature");
		double temp=sc.nextInt();
		sc.close();
		System.out.println(Temperture.temperatureConversion(choice,temp));

	}

}
