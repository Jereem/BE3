package Game_Board;

import java.util.ArrayList;
 
public class Game {
	private ArrayList<Player> myPlayers;
	private int numPlayer;
	private String myRules;
	private Board myBoard;
	public Player unnamed_Player_;
	public Board unnamed_Board_;

        public String getHelp() {
		throw new UnsupportedOperationException();
	}

	public int getNumber_of_player() {
		return this.numPlayer;
	}

	public void setNumber_of_player(int aNumber_of_player) {
		this.numPlayer = aNumber_of_player;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object aAttribute) {
		throw new UnsupportedOperationException();
	}

	public String getRules() {
		return this.myRules;
	}

	public void setRules(String aRules) {
		this.myRules = aRules;
	}

	public Board getBoard() {
		return this.myBoard;
	}

	public void setBoard(Board aBoard) {
		this.myBoard = aBoard;
	}
}