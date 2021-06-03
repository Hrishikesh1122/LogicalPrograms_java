package util;

public class Binary {
	
	/**
	 * @param decimal number from main method
	 * Stores binary numbers in an array
	 * Prints the array
	 */
	public static void toBinary(int decimal) {
		int bin[]=new int[100];
		int counter=0;
		
		while(decimal>0)
		{
			bin[counter++]=decimal%2;
			decimal/=2;
		}
		for(int j=counter-1;j>=0;j--)
		{
			System.out.println(bin[j]);
		}
	}

}
