package Game_Board;

import java.util.ArrayList;
 
public class Game {
	private ArrayList<Player> myPlayers;
	private String myRules;
	private Board myBoard;
        private boolean isAlive;
        
	
      

        public Game (){
            this.myPlayers={};
            this.myBoard={};
            this.isAlive=true;
            this.myRules="soyez_gentils" ;
            
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