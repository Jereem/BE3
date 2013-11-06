package Game_Board;

public class CheckerBox {
	private int _line;
	private int _column;
	public CheckerBoard _unnamed_CheckerBoard_;

	public CheckerBox(int aNbLine, int aNbColumn) {
		throw new UnsupportedOperationException();
	}

	public int getLine() {
		return this._line;
	}

	public int getColumn() {
		return this._column;
	}

	public void setLine(int aPLine) {
		this._line = aPLine;
	}

	public void setColumn(int aPColumn) {
		this._column = aPColumn;
	}
}