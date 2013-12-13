package Game_Board;

import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author BE3 Group
 * 
 */
public class Game {
	protected ArrayList<Player> myPlayers = new ArrayList<>();
	protected String myRules;
        protected boolean isAlive;        

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
    
    public void putGame(){
        for (Player elem : myPlayers) {
                System.out.println("Players : ");
                System.out.println(elem.toString());
                System.out.println("Board : ");
            }
    }
}