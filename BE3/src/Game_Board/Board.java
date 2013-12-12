/**
 *
 * @author teddy.delavallee
 */
package Game_Board;

public class Board {
	protected int nbBox;
        
        public Board() {
            this.nbBox=0;
	}
        
	public Board(int pNbBox) {
		this.nbBox=pNbBox;
	}

	public int getNbBox() {
		return this.nbBox;
	}

	public void setNbBox(int pNbBox) {
		this.nbBox=pNbBox;
	}
        
	public void putBoard() 
	{
            System.out.print("Board of ");
            System.out.print(this.nbBox);
            System.out.println(" Box");
	}

}