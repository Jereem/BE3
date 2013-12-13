package Game_Board;

import java.util.ArrayList;
 
/**
 *
 * @author BE3 Group
 */
public class Game {
	protected ArrayList<Player> myPlayers = new ArrayList<>();
	protected String myRules;
	protected Board myBoard;
        protected boolean isAlive;

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