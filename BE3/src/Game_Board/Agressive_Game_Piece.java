package Game_Board;

import java.awt.Color;

/**
 *
 * @author teddy.delavallee
 */
public class Agressive_Game_Piece extends Mobile_Game_Piece {

    /**
     *
     * @param b
     * @param aalive
     * @param c
     * @param s
     * @param uB
     */
    public Agressive_Game_Piece(Box b, boolean aalive , Color c, String s, Board uB){
            super(b,aalive,c,s,uB);
        }

    /**
     *
     * @param p1
     * @param p2
     * @param aBox_b
     */
    public void attack(Game_Piece p1, Game_Piece p2, Box aBox_b) {
                p1.setCoordinates(aBox_b);
                p2.setCoordinates(null);
                p2.setIsAlive();
	}

    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    public boolean confirmAttack(Game_Piece p1, Game_Piece p2) {
		throw new UnsupportedOperationException();
	}
        
}