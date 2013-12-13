package Game_Board;

import java.util.ArrayList;
 
/**
 *
 * @author teddy.delavallee
 */
public class Game {
	private ArrayList<Player> myPlayers;
	private String myRules;
	private Board myBoard;
        private boolean isAlive;

    /**
     *
     * @param p
     * @param b
     * @param s
     */
    public Game (ArrayList<Player> p,Board b, String s){
            this.myPlayers=p;
            this.myBoard=b;
            this.isAlive=true;
            this.myRules=s;
            
        }

    /**
     *
     * @return
     */
    public String getRules() {
		return this.myRules;
	}

    /**
     *
     * @param aRules
     */
    public void setRules(String aRules) {
		this.myRules = aRules;
	}

    /**
     *
     * @return
     */
    public Board getBoard() {
		return this.myBoard;
	}

    /**
     *
     * @param aBoard
     */
    public void setBoard(Board aBoard) {
		this.myBoard = aBoard;
	}
}