package util;
public class Emi {
	public static double monthlyPayment(double principle,int years,double roi) {
		int n=12*years;
		double r=roi/(12*100);
		double payment=(principle*r)/(1-(Math.pow((1+r),(-n))));
		return payment;
	}

}
