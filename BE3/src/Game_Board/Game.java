package Game_Board;

import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author BE3 Group
 */
public class Game {
	protected ArrayList<Player> myPlayers = new ArrayList<>();
	protected String myRules;
	protected Board myBoard;
        protected boolean isAlive;

        public Game(){
            this.myPlayers = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Players number (max 8):");
            int str = sc.nextInt();
            if (str < 0 || str >8){
                System.out.println("PLAYERS NUMBER ERROR, please try again");
                sc.nextInt();
            }
            System.out.println("Players number : " + str);
            for (int i = 0; i < str; i++) {
                Player pPlayer = new Player();
                myPlayers.add(pPlayer);
            }
            this.myBoard= new Board();
            this.isAlive=true;
            this.myRules= "No Rules";
        }
        
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
    
    public void putGame(){
        for (Player elem : myPlayers) {
                System.out.println("Players : ");
                System.out.println(elem.toString());
                System.out.println("Board : ");
                myBoard.putBoard();
            }
    }
}