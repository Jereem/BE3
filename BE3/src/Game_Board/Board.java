/**
 *
 * @author BE3 Group
 */
package Game_Board;

/**
 *
 * @author Teddy Delavallee
 */
public class Board {

    /**
     * Nombre de case du plateau
     */
    protected int nbBox;

    /**
     * Constructeur par default d'un plateau
     */
    public Board() {
            this.nbBox=0;
	}

    /**
     * Constructeur d'un plateau
     * @param pNbBox
     */
    public Board(int pNbBox) {
		this.nbBox=pNbBox;
	}

    /**
     * 
     * @return
     */
    public int getNbBox() {
		return this.nbBox;
	}

    /**
     *
     * @param pNbBox
     */
    public void setNbBox(int pNbBox) {
		this.nbBox=pNbBox;
	}

    /**
     *
     */
    public void putBoard() 
	{
            System.out.print("Board of ");
            System.out.print(this.nbBox);
            System.out.println(" Box");
	}

}