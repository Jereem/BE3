package Game_Board;

import static java.lang.Math.sqrt;

public class CheckerBoard extends Board{
	private int height;
	private int width;
	private final CheckerBox checker[][] = new CheckerBox[height][width];
        
	public CheckerBoard(int pNbBox){
            super();
            this.height = (int) sqrt(nbBox);
            this.width = (int) sqrt(nbBox);
           for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.checker[i][j].setLine(i);
                this.checker[i][j].setColumn(j);
            }
            System.out.println("");
        }
    }
;
}
