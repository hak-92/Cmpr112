import java.util.Scanner;

public class Guess_lab7 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;	
		computerNum = 0 + (int)(Math.random()*10);		
		
		
		int result = 0;
		int choice = 0;
		
		while (choice == 0){
		//while (result == 0){
			
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
			
	//	System.out.println(computerNum);
		
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
		
	System.out.println("Do you want to keep playing? 0 for yes, 1 for no");
	choice = input.nextInt();
		}
	  }
	

}
