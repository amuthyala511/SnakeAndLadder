import java.util.*;
import java.util.Random;
public class SnakeandLadderGame
{
	public static void main(String[] args)
	{
		System.out.println("This is a Snake and Ladder game simulation");
		final int START_POSITION=0;
		final int END_POSITION=100;
		int position=0;
		System.out.println("The player is at start position: "+START_POSITION);
		Random random=new Random();
		int dienumber=(random.nextInt(6)+1);
		position=position+dienumber;
		System.out.println("The player changed the position to: "+position);
	}
}
