package Game_Board;

import java.awt.Color;

public class CheckerBox {
	private int line;
	private int column;
        private Color couleur;

	public CheckerBox(int aNbLine, int aNbColumn) {
		throw new UnsupportedOperationException();
	}

	public int getLine() {
		return this.line;
	}

	public int getColumn() {
		return this.column;
	}

	public void setLine(int aPLine) {
		this.line = aPLine;
	}

	public void setColumn(int aPColumn) {
		this.column = aPColumn;
	}
        
        public Color getCouleur() {
		return this.couleur;
	}

	public void setCouleur(Color aPCouleur) {
		this.couleur = aPCouleur;
	}
}