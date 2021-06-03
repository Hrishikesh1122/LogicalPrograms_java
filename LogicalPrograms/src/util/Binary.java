package util;

public class Binary {
	
	/**
	 * @param decimal number from main method
	 * Stores binary numbers in an array
	 * Returns array
	 */
	public static int[] toBinary(int decimal) {
		int bin[]=new int[100];
		int counter=0;
		
		while(decimal>0)
		{
			bin[counter++]=decimal%2;
			decimal/=2;
		}
		int ret[]=new int[counter];
		
		for(int j=counter-1,i=0; j>=0 || i<counter; j--,i++)
		{
			ret[i]=bin[j];
		}
		for(int i:ret)
		{
			System.out.println(i);
		}
		System.out.println("///////");
		return ret;
	}

}
