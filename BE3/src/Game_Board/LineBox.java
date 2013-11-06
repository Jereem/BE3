package Game_Board;

public class LineBox {
	private int _index;
	public LineBoard _unnamed_LineBoard_;

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
		return this._index;
	}

	public LineBox(int aIndex) {
		throw new UnsupportedOperationException();
	}

	public void setIndex(int aPIndex) {
		this._index = aPIndex;
	}
}