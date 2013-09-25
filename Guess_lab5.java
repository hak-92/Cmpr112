import java.util.Scanner;

public class Guess_lab5 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;
		int run =0;
		
		while ( run < 3)
		{
		computerNum = 0 + (int)(Math.random()*10);	
		
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
		System.out.println("The number is:");
		System.out.println(computerNum);
		
		if (computerNum < num)
		{	
			System.out.println("Your guess is too large!");
		}
	  
		else if (computerNum > num)
		{	
			System.out.println("Your guess is too small!");
		}
		
		else
		{	
			System.out.println("You got it! Good guess!");
			
		}
		
		run++;
		}
	 
	  }
}
