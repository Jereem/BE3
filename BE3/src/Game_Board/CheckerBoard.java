/**
 *
 * @author BE3 Group
 */
package Game_Board;

import java.awt.Color;
import static java.lang.Math.sqrt;

/**
 *
 * @author teddy.delavallee
 */
public class CheckerBoard extends Board {

    private int height;
    private int width;
    private CheckerBox[][] checker = new CheckerBox[height][width];

    /**
     *
     * @param pNbBox
     */
    public CheckerBoard(int pNbBox) {
        super();
        this.height = (int) sqrt(nbBox);
        this.width = (int) sqrt(nbBox);
        this.checker = new CheckerBox[height][width];
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.checker[i][j] = new CheckerBox();
                this.checker[i][j].setLine(i);
                this.checker[i][j].setColumn(j);
                if (i % 2 == j % 2) {
                    this.checker[i][j].setCouleur(Color.BLACK);
                } else {
                    this.checker[i][j].setCouleur(Color.WHITE);
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Hauteur : " + this.height + "\n" + "Largeur : " + this.width;
    }
    
    /**
     *
     */
    @Override
    public void putBoard() {
        super.putBoard();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
            this.checker[i][j].putBox();
            }
        }
    }

}
