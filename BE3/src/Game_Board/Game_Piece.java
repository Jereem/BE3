package Game_Board;


import java.awt.Color;

public class Game_Piece {
	private Box coordinates;
	private boolean isAlive;
	private Color couleur;
	private String name;
	private Board unnamed_Board;

	public Game_Piece(Box b, boolean aalive , Color c, String s, Board uB) {
		this.coordinates = b;
                this.isAlive = aalive;
                this.couleur = c;
                this.name = s;
                this.unnamed_Board = uB;
	}

	public Box getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(Box aCoordinates) {
		this.coordinates = aCoordinates;
	}

	//public boolean confirmCoordinates(Object aBox_c) {
	//	throw new UnsupportedOperationException();
	//}

	public void setIsAlive() {
		this.isAlive = !(this.isAlive);
	}

	public Color getCouleur() {
		return this.couleur;
	}

	public void setCouleur(Color aCouleur) {
		this.couleur = aCouleur;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String aName) {
		this.name = aName;
	}
}