package Game_Board;

import java.awt.Color;

/**
 *
 * @author teddy.delavallee
 */
public class Mobile_Game_Piece extends Game_Piece {

    /**
     *
     */
    public Box[] possibility; //listmovement = tableau de boxes calculées par le programme principal ?
	//private listMovement movement;

    public Mobile_Game_Piece(Player pName) {
        super(pName);
    }



    /**
     *
     * @param possibility
     */
    public void setPossibility (Box[] possibility) {
		throw new UnsupportedOperationException();
	}

    /**
     *
     * @param mgp
     * @param b
     *
     */
    public void move(Mobile_Game_Piece mgp, Box b) {
		throw new UnsupportedOperationException();
	}

}