package Game_Board;

public class Game {
	private Player[] _player;
	private int _number_of_player;
	private String _rules;
	private Board _board;
	public Player _unnamed_Player_;
	public Board _unnamed_Board_;

	public String getHelp() {
		throw new UnsupportedOperationException();
	}

	public int getNumber_of_player() {
		return this._number_of_player;
	}

	public void setNumber_of_player(int aNumber_of_player) {
		this._number_of_player = aNumber_of_player;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object aAttribute) {
		throw new UnsupportedOperationException();
	}

	public String getRules() {
		return this._rules;
	}

	public void setRules(String aRules) {
		this._rules = aRules;
	}

	public Board getBoard() {
		return this._board;
	}

	public void setBoard(Board aBoard) {
		this._board = aBoard;
	}
}