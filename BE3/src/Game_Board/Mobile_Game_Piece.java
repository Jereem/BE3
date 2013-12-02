package Game_Board;

import java.awt.Color;

public class Mobile_Game_Piece extends Game_Piece {
	public Enum listMovement; //listmovement = tableau de boxes calculées par le programme principal ?
	//private listMovement movement;

	public Enum getListMovement() {
		throw new UnsupportedOperationException();
	}

	public void setListMovement(Enum aListMovement) {
		throw new UnsupportedOperationException();
	}

	public void move(Object aGame_Piece_p, Object aListMovement_Enum) {
		throw new UnsupportedOperationException();
	}

	public Mobile_Game_Piece(Box b, boolean aalive , Color c, String s, Board uB) {
		super(b,aalive,c,s,uB);
	}
}