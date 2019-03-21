public class Assign3Class {

	public static void main(String[] args) {// my main method
		System.out.println("Welcome to the NIM game\nWe play by the misère rules");
		Nim game1 = new Nim(); // creating a game1 in the main method
		boolean isPlayerTurn, isGameDone; // declaring the boolean variables whic are the players
		do // do loop
		{
			game1.printPile(); //runs print pile method
			isPlayerTurn = game1.playerMove();// makes the player turn = to the player move function
			if (isPlayerTurn) // 
			{ 
				isGameDone = game1.done(); 
				if (isGameDone) //if it is the users turn and all the piles are equal to 0 then The player loses
				{
					System.out.println("Lose");
					break;
				}
				else // then this means that the player has won is runs the method and if isGameDone is = to game1.done then the player has won
				{
					game1.printPile();
					game1.computerRandomMove();
					isGameDone = game1.done();
					if (isGameDone)
					{
						System.out.println("Win");
						break;
					}
				}
			}
			
		} while(!game1.done());// this function repeats this method until the player wins or losses

	}

}
