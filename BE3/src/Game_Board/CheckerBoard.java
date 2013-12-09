/**
 *
 * @author teddy.delavallee
 */
package Game_Board;

import java.awt.Color;
import static java.lang.Math.sqrt;

public class CheckerBoard extends Board {

    private int height;
    private int width;
    private final CheckerBox checker[][] = new CheckerBox[height][width];

    public CheckerBoard(int pNbBox) {
        super();
        this.height = (int) sqrt(nbBox);
        this.width = (int) sqrt(nbBox);
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
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

}
