
public class Pile {
	private int size; //declaring my private variable


public Pile() {
	size = 10; //setting the start values of the piles to 10
}

public int getSize() { //return size
	return size;
}

void remove(int amount) { //this calculation subtracts the amount the user inputed from the selected box
	size = size - amount;
}




}
