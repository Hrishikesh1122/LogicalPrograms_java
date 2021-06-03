package util;
public class Temperture {

	public static double temperatureConversion(int choice,double temp){
		double degF=0;
		double degC=0;
		switch (choice) {
		case 1: degF=(((temp*9)/5)+32);
		        return degF;
		case 2: degC=((5*(temp-32)/9));
				return degC;
		default: 
			    System.out.println("Invalid choice, Enter 1 or 2");
                return 0;			
		}
		
	}
}
