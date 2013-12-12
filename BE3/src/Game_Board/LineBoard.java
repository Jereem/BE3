/**
 *
 * @author teddy.delavallee
 */
package Game_Board;

public class LineBoard extends Board {

    protected LineBox[] path = new LineBox[nbBox];
    
    public LineBoard() {
        super();
        this.path = new LineBox[nbBox];
        for (int i = 0; i < this.path.length; i++) {
            this.path[i].setIndex(i);
        }
    }
    
    public LineBox[] getPath(){
        return this.path;
    }
    
    public LineBox getPath(int n){
        return this.path[n];
    }
    
    public LineBoard(int pNbBox) {
        super();
        for (int i = 0; i < this.path.length; i++) {
            this.path[i].setIndex(i);
        }
    }
    
    @Override
    public void putBoard() {
        System.out.print("Board of ");
        System.out.print(this.nbBox);
        System.out.println(" Box");
        for (int i = 0; i < this.path.length; i++) {
            path[i].putBox();
        }
    }
}