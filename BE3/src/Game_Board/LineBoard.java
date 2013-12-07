package Game_Board;

public class LineBoard extends Board{
	private LineBox[] path;

	public LineBoard(){
            super();
            LineBox[] path = new LineBox[nbBox];
        }
}