/**
 *
 * @author BE3 Group
 */
package Game_Board;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author teddy.delavallee
 */
public class Box {

    /**
     *
     */
    protected ArrayList<Game_Piece> gamePieces = new ArrayList<>();
    private boolean isBusy;

    /**
     *
     */
    public Box() {
        this.isBusy = false;
    }

    /**
     *
     * @param p
     */
    public void setIsBusy(boolean p) {
        this.isBusy = p;
    }

    /**
     *
     * @return
     */
    public boolean getIsBusy() {
        return (this.isBusy);
    }

    /**
     *
     * @param pPiece
     */
    public void addGamePiece(Game_Piece pPiece) {
        gamePieces.add(pPiece);
        this.isBusy = true;
    }

    /**
     *
     * @param pPiece
     */
    public void delGamePiece(Game_Piece pPiece) {
        if (gamePieces.indexOf(pPiece) != -1) {
            gamePieces.remove(gamePieces.indexOf(pPiece));
        }
        if (gamePieces.isEmpty()) {
            this.isBusy = false;
        }
    }

    /**
     *
     * @param nbPiece
     */
    public void delGamePiece(int nbPiece) {
        gamePieces.remove(nbPiece);
        if (gamePieces.isEmpty()) {
            this.isBusy = false;
        }
    }

    /**
     *
     */
    public void putBox() {
        System.out.print("Is busy : ");
        System.out.println(this.isBusy);
        if (this.isBusy == true) {
            for (Game_Piece elem : gamePieces) {
                System.out.print("Game piece : ");
                System.out.println(elem.toString());
            }
        }
    }

}
