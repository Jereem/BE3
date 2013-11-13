package Game_Board;

public class LineBox {
	private int index;
	public LineBoard unnamed_LineBoard;

	/**
	 * Donne la case sur laquelle doit réellement aller le pion.
	 */
	public int consequence() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Donne le numéro de la case
	 */
	public int getIndex() {
		return this.index;
	}

	public LineBox(int aIndex) {
		throw new UnsupportedOperationException();
	}

	public void setIndex(int aPIndex) {
		this.index = aPIndex;
	}
}