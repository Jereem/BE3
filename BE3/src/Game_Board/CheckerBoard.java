package Game_Board;

public class CheckerBoard extends Board{
	private int height;
	private int width;
	private CheckerBox[][] checker;
        
	public CheckerBoard(int pHeight, int pWidth){
            super();
            this.height = pHeight;
            this.width = pWidth;
            CheckerBox checker[][] = new CheckerBox[height][width];
        };
}