import java.util.*;
import java.util.Random;
public class SnakeandLadderGame
{
	public static void main(String[] args)
	{
		System.out.println("This is a Snake and Ladder game simulation");
		final int START_POSITION=0;
		final int END_POSITION=100;
		final int IS_NoPLAY=0;
		final int IS_LADDER=1;
		final int IS_SNAKE=2;
		int position=0;
		System.out.println("The player is at start position: "+START_POSITION);
		Random random=new Random();
		int dienumber=(random.nextInt(6)+1);
		System.out.println("dice is rolled and the die number is: "+dienumber);
		int checkOption=(random.nextInt(3));
		if(checkOption == IS_LADDER)
		{
			position=position+dienumber;
         System.out.println("The player moves ahead by "+dienumber+" positions");
			System.out.println("Current position of the player is: "+position);
		}
		else if(checkOption == IS_SNAKE)
		{
			position=position-dienumber;
			System.out.println("The player moves behind by "+dienumber+" positions");
			System.out.println("Current position of the player is: "+position);
		}
		else if(checkOption == IS_NoPLAY)
		{
			System.out.println("No play. The player stays in the same position");
			System.out.println("Current position of the player is: "+position);
		}
	}
}
