import java.util.Scanner; //imports the scanner 

public class Nim { //declaring my private variables for the class

	private Pile pileA;
	private Pile pileB;
	private Pile pileC;


	Scanner input = new Scanner(System.in); //creating my scanner



	public Nim() { //sets my 3 piles to 10
		pileA = new Pile();
		pileB = new Pile();
		pileC = new Pile();
	}

	public boolean playerMove() { 
		boolean playerTurn = false; //my player turn has not happened yet so it starts at false
		int numA, numB, numC; // declaring my variables for this method
		int removeA, removeB, removeC; //same thing
		String inputPile;// same thing
		System.out.println("Select a pile"); //prompts user to select a pile
		inputPile = input.next();// 
		if (inputPile.equals("a") || inputPile.equals("A")) { //shows the condition of the input
			numA = pileA.getSize(); // runs the get size method

			if (numA == 0) { //if the pile is equal to 0 it promts the user to pick a new pile
				System.out.println("Pile is empty");
				playerTurn = false;
			}else {
				System.out.println("How many do you want to remove?"); //prompts the user to enter a amount to remove from the select pile
				removeA = input.nextInt();

				if (removeA <= numA) { //if the remove amount is less than or eaqual to the amount in the pile then player turn is done and it runs the remove method.

					playerTurn = true;
					pileA.remove(removeA);
				}

				else
				{
					System.err.println("That is an invalid value please pick a valid number"); //if the number exeeds the amount of the selected pile or is invalid 
					playerTurn = false;// player turn is false and is prompts user to pick a valid number
				}
				numA = pileA.getSize(); // returns the new size and prints it.
				System.out.println(numA);
			}




		} 
		else if (inputPile.equals("b") || inputPile.equals("B")) {//same method but for b
				numB = pileB.getSize();

				if (numB == 0) {
					System.err.println("Pile is empty");
					playerTurn = false;
				}else {
					System.out.println("How many do you want to remove");
					removeB = input.nextInt();

					if (removeB <= numB) {

						playerTurn = true;
						pileB.remove(removeB);
					}

					else
					{
						System.err.println("That is an invalid value please pick a valid number");
						playerTurn = false;
					}
					numB = pileB.getSize();
					System.out.println(numB);
				}		
			}else if (inputPile.equals("c") || inputPile.equals("C")) { // same method but for c
				numC = pileC.getSize();

				if (numC == 0) {
					System.err.println("Pile is empty");
					playerTurn = false;
				}else {
					System.out.println("How many do you want to remove");
					removeC = input.nextInt();

					if (removeC <= numC) {

						playerTurn = true;
						pileC.remove(removeC);
					}

					else
					{
						System.err.println("That is an invalid value please pick a valid number");
						playerTurn = false;
					}
					numC = pileC.getSize();
					System.out.println(numC);
				}
			}
				else {
					System.err.println("please pick pile a, b or c");
					playerTurn = false;
				}
		return playerTurn;



		} 
	public int getRandom(int max, int min)// this is my random method
	{
		int random = (int)(Math.random()*((max-min)+1))+min; //this is my algorithm for a random number, i did it this way because its easier for me to understand
		return random;
	}
	
	public void computerRandomMove() //method for th computer move
	{
		int size, pile, amount; // declaring my variables for the method
		size = 1; // make size = to 1
		do 
		{
			pile = getRandom (2,0); // runs my get random function
			if (pile == 0)// if the pile is zero it then the computer has chose pile A
			{
				size = pileA.getSize();
				if (size > 0)// if size is greater than 0 it pciks a random amount between the selected amount an removes it
				{
					amount = getRandom (size,1);
					pileA.remove(amount);
					System.out.println ("Computer takes " + amount + " from pile A");
				}
			}
			
			else if (pile == 1) // if pile is = to 1 then it runs the same thing but for b
			{
				size = pileB.getSize();
				if (size > 0)
				{
					amount = getRandom (size,1);
					pileB.remove(amount);
					System.out.println ("Computer takes " + amount + " from pile B"); 
				}
			}
			
			else if (pile == 2) // if pile is = to 1 then it runs the same thing but for c
			{
				size = pileC.getSize();
				if (size > 0)
				{
					amount = getRandom (size,1);
					pileC.remove(amount);
					System.out.println ("Computer takes " + amount + " from pile C");
				}
			}
			
			
					
		} while (size == 0); // loop 
	}
	
	public boolean done()// this is my done method 
	{
		if (pileA.getSize() + pileB.getSize() + pileC.getSize() == 0)// if all piles are equal to 0 then the game is done, if not it continues
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void printPile() // this method prints the piles in a selected way
	{
		System.out.println("A   B   C");
		System.out.println(pileA.getSize() + "  " + pileB.getSize() + "  " + pileC.getSize());
	}
}






















