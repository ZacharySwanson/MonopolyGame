import java.util.*;

public class MonopolyGame{

	//instance variables
	public ArrayList<Player> playerList = new ArrayList<Player>();
	public Board board = new Board();
	public Input io = new Input();

	//methods
	public void initializePlayers(){
		//gets input from the use as to the number of players and each players name
		System.out.println("Input the number of players (2-4):");
		int numPlayers = Integer.parseInt(io.getInput());
		for(int i = 0; i < numPlayers ; i++){
			System.out.println("Input Player" + (i+1) + "'s name");
			playerList.add(new Player(io.getInput()));
		}
	}

}
		