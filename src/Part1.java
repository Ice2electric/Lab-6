import java.util.Scanner;


public class Part1 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		displayName();
		displayBirthday();
		displayFact();
		
	}
	
	public static void displayName() {

		System.out.println("Name:Daniel Olaniyanu");
	}
	public static void displayFact() {
		
		System.out.println("Fact: Youtuber,SUB TO ICE2ELECTRIC");
	}
	public static void displayBirthday() {
		
		System.out.println("BirthDate: May 16th 2001");
	}
	public static void sleep (int time)  {
	try {
		Thread.sleep(time);
		} 
	catch (Exception e)  {}
	}
}

