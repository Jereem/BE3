/**
 *
 * @author BE3 Group
 */
package Game_Board;

/**
 *
 * @author teddy.delavallee
 */
public class LineBoard extends Board {

    /**
     *
     */
    protected LineBox[] path = new LineBox[nbBox];
    
    /**
     *
     */
    public LineBoard() {
        super();
        this.path = new LineBox[nbBox];
        for (int i = 0; i < this.path.length; i++) {
            this.path[i] = new LineBox();
            this.path[i].setIndex(i);
        }
    }
    
    /**
     *
     * @return
     */
    public LineBox[] getPath(){
        return this.path;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public LineBox getPath(int n){
        return this.path[n];
    }
    
    /**
     *
     * @param pNbBox
     */
    public LineBoard(int pNbBox) {
        super();
        for (int i = 0; i < this.path.length; i++) {
            this.path[i].setIndex(i);
        }
    }
    
    /**
     *
     */
    @Override
    public void putBoard() {
        super.putBoard();
        for (int i = 0; i < this.path.length; i++) {
            path[i].putBox();
        }
    }
}