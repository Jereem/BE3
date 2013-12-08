package Game_Board;

import java.util.ArrayList;
 
public class Game {
	private ArrayList<Player> myPlayers;
	private String myRules;
	private Board myBoard;
        private boolean isAlive;
        
	
      

        public Game (ArrayList<Player> p,Board b, String s){
            this.myPlayers=p;
            this.myBoard=b;
            this.isAlive=true;
            this.myRules=s;
            
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