package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Player;

/**
 * The code CheckersWindow class is responsible for managing a window.
 */

public class CheckersWindow extends JFrame {

//	https://www.tutorialspoint.com/importance-of-serialversionuid-keyword-in-java#:~:text=The%20SerialVersionUID%20can%20be%20used,it%20can%20throw%20an%20InvalidClassException.
// becasue it uses the and manages the window hence a serial version UID is added
// used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible
	private static final long serialVersionUID = 1L;

	/** The default width for the checkers window. */
	public static final int DEFAULT_WIDTH = 500;

	/** The default height for the checkers window. */
	public static final int DEFAULT_HEIGHT = 600;

	/** The default title for the checkers window. */
	public static final String DEFAULT_TITLE = "CHECKERS_GAME";

	/** The checker board component playing the updatable game. */
	private CheckerBoard board;

	public CheckersWindow() {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_TITLE);
	}

	public CheckersWindow(Player player1, Player player2) {
		this();
		setPlayer1(player1);
		setPlayer2(player2);
	}

	public CheckersWindow(int width, int height, String title) {

		// Setup the window
		super(title);
		super.setSize(width, height);
		super.setLocationByPlatform(true);

		// Setup the components
		JPanel layout = new JPanel(new BorderLayout());
		this.board = new CheckerBoard(this);
		layout.add(board, BorderLayout.CENTER);
		this.add(layout);

	}

	public CheckerBoard getBoard() {
		return board;
	}

	/**
	 * Updates the type of player that is being used for player 1.
	 * 
	 * player1 the new player instance to control player 1.
	 */
	public void setPlayer1(Player player1) {
		this.board.setPlayer1(player1);
		this.board.update();
	}

	/**
	 * Updates the type of player that is being used for player 2.
	 * 
	 * player2 the new player instance to control player 2.
	 */
	public void setPlayer2(Player player2) {
		this.board.setPlayer2(player2);
		this.board.update();
	}

}
