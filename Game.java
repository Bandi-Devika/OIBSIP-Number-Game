import java.util.*;
class NumberGame
{
	public void guess()
	{
		
		Scanner sc=new Scanner(System.in);
	    int value = 1 + (int)(100 * Math.random());
		System.out.println("A Random Number is generated .");
		int ch=5;
		System.out.println("Guess the number within 5 trials");
		int score=100,chance=1;
		for(chance=1;chance<=ch;chance++)
		{
			
			System.out.println("Enter the number you guessed.Chance no"+(chance));
			int number=sc.nextInt();
			if(number==value)
			{
				System.out.println("Congratulations!...You won the Game");
				System.out.println("Your score is "+score);
				break;
			}
			else if(number>value)
			{
				System.out.println(" number is less than "+number);
				
				score-=20;
			}
			else
			{
				System.out.println("number is greater than "+number);
				score-=20;
			}
			
		} 
		if(chance>ch)
		{
		    System.out.println("You Lost the game");
			System.out.println("The number is "+value);
			System.out.println("Your score is: 0");
		}
	}
}
class Game
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
    	NumberGame f=new NumberGame();
    	System.out.println("Shall we start the game ? : Yes/No");
    	String str=sc.nextLine();
    	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
    	{
    		f.guess();
    		System.out.println("Do you want to play again ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game Over!");
    }
}


