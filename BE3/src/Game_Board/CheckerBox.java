/**
 *
 * @author BE3 Group
 */
package Game_Board;

import java.awt.Color;

/**
 *
 * @author teddy.delavallee
 */
public class CheckerBox extends Box{
	private int line;
	private int column;
        private Color couleur;

    /**
     *
     */
    public CheckerBox() {
		throw new UnsupportedOperationException();
	}

    /**
     *
     * @return
     */
    public int getLine() {
		return this.line;
	}

    /**
     *
     * @return
     */
    public int getColumn() {
		return this.column;
	}

    /**
     *
     * @param aPLine
     */
    public void setLine(int aPLine) {
		this.line = aPLine;
	}

    /**
     *
     * @param aPColumn
     */
    public void setColumn(int aPColumn) {
		this.column = aPColumn;
	}

    /**
     *
     * @return
     */
    public Color getCouleur() {
		return this.couleur;
	}

    /**
     *
     * @param aPCouleur
     */
    public void setCouleur(Color aPCouleur) {
		this.couleur = aPCouleur;
	}

    /**
     *
     */
    @Override
    public void putBox() {
        System.out.println("");
        System.out.print("Box number : ");
        System.out.println(this.line);
        System.out.println("-");
        System.out.println(this.column);
        super.putBox();
    }
}