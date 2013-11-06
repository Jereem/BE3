package Game_Board;

import java.awt.Color;

public class Player {
	private String _name;
	private Color _color;
	private int _winning_counter;
	public Game _unnamed_Game_;

	public String getName() {
		return this._name;
	}

	public void setName(String aAttribute) {
		this._name = aAttribute;
	}

	public Color getColor() {
		return this._color;
	}

	public void setColor(Color aColor) {
		this._color = aColor;
	}

	public int getWinning_counter() {
		return this._winning_counter;
	}

	public void setWinning_counter(int aWinning_counter) {
		this._winning_counter = aWinning_counter;
	}
}