import java.util.Scanner;

public class Guess_lab3 {

	private static Scanner input;

	public static void main ( String [] args)

	  {
	  
		input = new Scanner (System.in);
		int computerNum;	
		computerNum = 0 + (int)(Math.random()*10);		
		
		
		int result = 0;
		
		while (result == 0){
			
		System.out.println("Guess a number!");
	
		int num = input.nextInt();
			
	//	System.out.println(computerNum);
		
			  
		if (computerNum < num)
		{	
			System.out.println("Your guess is too large! Try again!");
		}
	  
		else if (computerNum > num)
		{	
			System.out.println("Your guess is too small! Try again!");
		}
		
		else
		{	
			System.out.println("You got it! Good guess!");
			result =1;
		}
		}
	  }

}
