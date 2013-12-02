package Game_Board;

import java.awt.Color;



public class Agressive_Game_Piece extends Mobile_Game_Piece {
    
        public Agressive_Game_Piece(Box b, boolean aalive , Color c, String s, Board uB){
            super(b,aalive,c,s,uB);
        }

	public void attack(Game_Piece p1, Game_Piece p2, Box aBox_b) {
                p1.setCoordinates(aBox_b);
                p2.setCoordinates(null);
                p2.setIsAlive();
	}

	public boolean confirmAttack(Game_Piece p1, Game_Piece p2) {
		throw new UnsupportedOperationException();
	}
        
}