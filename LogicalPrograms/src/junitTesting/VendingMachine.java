package junitTesting;
import java.util.Scanner;
public class VendingMachine {
	
	public static void countNotes(int change)
    {
        int[] notes = new int[]{ 1000, 500, 100, 50, 10, 5, 2, 1 };
        int[] noteCounter = new int[8];
        for (int i = 0; i < 8; i++) {
            if (change >= notes[i]) {
                noteCounter[i] = change / notes[i];
                change = change - noteCounter[i] * notes[i];
            }
        }
        int sum=0;
        for(int j:noteCounter)
        {
        	sum+=j;
        }
        System.out.println("Number of notes recieved :"+sum);
        System.out.println("Change recieved :");
        for (int i = 0; i < 8; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the change ");
		int change=sc.nextInt();
		sc.close();
		countNotes(change);

	}

}
