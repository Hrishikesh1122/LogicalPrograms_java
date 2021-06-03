package junitTesting;
import java.util.Scanner;
import util.Binary;
public class convertToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int decimal=sc.nextInt();
		sc.close();
		int[] binary=Binary.toBinary(decimal);
		for(int i:binary)
		{
			System.out.println(i);
		}

	}

}
