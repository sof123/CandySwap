import java.util.Scanner;


public class CandySwap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int initCandies;
		System.out.println("How many candies are there initially?");
		initCandies = input.nextInt();
		
		int exchangeCost;
		System.out.println("How many wrappers does it cost to get one piece of candy?");
		exchangeCost = input.nextInt();
		printCandies(initCandies,exchangeCost);
		input.close();
		

	}
	
	public static void printCandies(int initialCandies, int exchangeCost)
	{
		
		int initCandies = initialCandies;
		int currentWrappers = initialCandies;
		int newWrappers = 0;
		while (currentWrappers >= exchangeCost)
		{
			newWrappers++;
			currentWrappers-=exchangeCost -1;
		}
		
		System.out.println("Total candies: " + (initCandies + newWrappers));
		System.out.println("# of wrapper remainders: " + currentWrappers);
	}

}
