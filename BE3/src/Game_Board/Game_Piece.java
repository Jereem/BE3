package Game_Board;


import java.awt.Color;

public class Game_Piece {
	public Box coordinates;
	private boolean alive;
	private Color couleur;
	private String name;
	public Board unnamed_Board;

	public Game_Piece(Object aBox_Color, Object aString) {
		throw new UnsupportedOperationException();
	}

	public Box getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(Box aCoordinates) {
		this.coordinates = aCoordinates;
	}

	public boolean confirmCoordinates(Object aBox_c) {
		throw new UnsupportedOperationException();
	}

	public void delete(Object aGame_Piece) {
		throw new UnsupportedOperationException();
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