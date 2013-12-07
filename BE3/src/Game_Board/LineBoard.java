package Game_Board;

public class LineBoard extends Board {

    private final LineBox[] path = new LineBox[nbBox];
    
    public LineBoard(int pNbBox) {
        super();
        for (int i = 0; i < this.path.length; i++) {
            this.path[i].setIndex(i);
        }
    }
}