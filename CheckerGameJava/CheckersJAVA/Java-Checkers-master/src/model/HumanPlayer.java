package model;

/*
 * The code HumanPlayer class represents a user of the checkers game that
 * can update the game by clicking on tiles on the board.
 */
public class HumanPlayer extends Player {

	@Override
	public boolean isHuman() {
		return true;
	}

	/*
	 * Performs no updates on the game. 
	 */
	@Override
	public void updateGame(Game game) {}

}
