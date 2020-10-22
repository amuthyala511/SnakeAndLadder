import java.util.Random;
public class SnakeandLadderGame
{
	static final int START_POSITION=0;
	static final int END_POSITION=100;
	static final int IS_NoPLAY=0;
	static final int IS_LADDER=1;
	static final int IS_SNAKE=2;
	static int numberofPlayers=2;
	static int[] playerarray = new int[numberofPlayers];
	static int dicecount=0;
	public static void setPlayerPosition()
	{
		for(int i=0;i<playerarray.length;i++)
		{
			playerarray[i]=START_POSITION;
		}
	}
	public static void winPosition()
	{
		int player1_Position=0, player2_Position=0;
		for(int i=0;i<playerarray.length;i++)
		{
			System.out.println("current player is Player "+(i+1));
			dicecount++;
			Random random=new Random();
			int dienumber=(random.nextInt(6)+1);
			System.out.println("dice is rolled and the die number is: "+dienumber);
			int checkOption=(random.nextInt(3));
			System.out.println("option resulted is: "+checkOption);
			if(checkOption == IS_LADDER)
			{
				player1_Position=(playerarray[i]+dienumber);
				if(player1_Position > END_POSITION)
				{
					System.out.println("No play, the player exceeded end position");
					System.out.println("current position of the player after "+dicecount+" rolls is: "+playerarray[i]);
				}
				else
				{
					playerarray[i]=player1_Position;
					System.out.println("The player moves ahead by "+dienumber+" positions");
					System.out.println("Current position of the player after "+dicecount+" rolls is: "+playerarray[i]);
					if(playerarray[i] != END_POSITION)
					{
						winPosition();
					}
				}
			}
			else if(checkOption == IS_SNAKE)
			{
				player2_Position=(playerarray[i]-dienumber);
				playerarray[i]=player2_Position;
				System.out.println("The player moves behind by "+dienumber+" positions");
				System.out.println("Current position of the player after "+dicecount+" rolls is: "+playerarray[i]);
				if(playerarray[i] < START_POSITION)
				{
					playerarray[i]=0;
				}
			}
			else if(checkOption == IS_NoPLAY)
			{
				System.out.println("No play. The player stays in the same position");
				System.out.println("Current position of the player after "+dicecount+" rolls is: "+playerarray[i]);
			}
		}
	}
	public static void turn()
	{
		setPlayerPosition();
		int game=0;
		while(game != 1)
		{
			for(int i=0;i<playerarray.length;i++)
			{
				System.out.println("current player is Player "+(i+1));
				winPosition();
				if(playerarray[i] == END_POSITION)
				{
					game = 1;
					System.out.println("Player "+(i+1)+" won the game");
					break;
				}
			}
		}
		for(int i=0;i<numberofPlayers;i++)
		{
			System.out.println("Player "+(i+1)+" is at position: "+playerarray[i]);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("This is a Snake and Ladder game simulation");
		winPosition();
		turn();
		System.out.println("Total number of times dice was thrown: "+dicecount);
	}
}
