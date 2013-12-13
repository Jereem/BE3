package Game_Board;

import java.awt.Color;

/**
 *
 * @author teddy.delavallee
 */
public class Agressive_Game_Piece extends Mobile_Game_Piece {

    public Agressive_Game_Piece(Player pName) {
        super(pName);
    }


    /**
     *
     * @param p1
     * @param p2
     * @param aBox_b
     */
    public void attack(Game_Piece p1, Game_Piece p2, Box aBox_b) {
/// CONDITION 
                if (confirmAttack( p1, p2)) {
                    p1.setCoordinates(p2.coordinates);
                    p2.setCoordinates(null);
                    p2.setIsAlive();
        }
                else { 
                    System.out.println("Error this piece not can attack at this coordinates");
                }
    }

    /**
     *
     * @param p1 my piece
     * @param p2 attacked piece
     * @return true if enemy piece and can attack piece
     */
    public boolean confirmAttack(Game_Piece p1, Game_Piece p2) {
        return p1.couleur != p2.couleur;
	}
        
}