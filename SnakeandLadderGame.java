import java.util.*;
import java.util.Random;
public class SnakeandLadderGame
{
	static final int START_POSITION=0;
	static final int END_POSITION=100;
	static final int IS_NoPLAY=0;
	static final int IS_LADDER=1;
	static final int IS_SNAKE=2;
	public static void winPosition()
	{
		int position=0, dicecount=0;
		System.out.println("The player is at start position: "+START_POSITION);
		while(position != END_POSITION)
		{
			dicecount++;
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
				if(position < START_POSITION)
				{
					position=START_POSITION;
					System.out.println("The player position is set to start from Zero");
				}
				else
				{
					System.out.println("The player moves behind by "+dienumber+" positions");
					System.out.println("Current position of the player is: "+position);
				}
			}
			else if(checkOption == IS_NoPLAY)
			{
				System.out.println("No play. The player stays in the same position");
				System.out.println("Current position of the player is: "+position);
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("This is a Snake and Ladder game simulation");
		winPosition();
	}
}
