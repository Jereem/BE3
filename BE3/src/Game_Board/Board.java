package Game_Board;

import java.util.ArrayList;

public class Board {
	protected int nbBox;
	protected Arraylist<Game_Piece> gamePieces = new ArrayList<Game_Piece>();
        
        public Board() {
	}
        
	public Board(int pNbBox) {
		this.nbBox=pNbBox;
	}

	public int getNbBox() {
		return this.nbBox;
	}

	public void setNbBox(int pNbBox) {
		this.nbBox=pNbBox;
	}

	public void addGamePiece(Game_Piece pPiece){
            gamePieces.add(pPiece);
        }
        
        public void delGamePiece(Game_Piece pPiece){
            if(gamePieces.indexOf(pPiece) != -1){
                gamePieces.remove(gamePieces.indexOf(pPiece));
            }
        }
            
        public void delGamePiece(int nbPiece){
                gamePieces.remove(nbPiece);
        }
}