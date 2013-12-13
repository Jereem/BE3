package Game_Board;


import java.awt.Color;

/**
 *
 * @author BE3 Group
 */
public class Game_Piece {
	private Box coordinates;
	private boolean isAlive;
	private Color couleur;
	private String name;
	private Board unnamed_Board;

    /**
     *
     * @param b
     * @param aalive
     * @param c
     * @param s
     * @param uB
     */
    public Game_Piece(Box b, boolean aalive , Color c, String s, Board uB) {
		this.coordinates = b;
                this.isAlive = aalive;
                this.couleur = c;
                this.name = s;
                this.unnamed_Board = uB;
	}

    /**
     *
     * @return
     */
    public Box getCoordinates() {
		return this.coordinates;
	}

    /**
     *
     * @param aCoordinates
     */
    public void setCoordinates(Box aCoordinates) {
		this.coordinates = aCoordinates;
	}

	//public boolean confirmCoordinates(Object aBox_c) {
	//	throw new UnsupportedOperationException();
	//}

    /**
     *
     */
    
	public void setIsAlive() {
		this.isAlive = !(this.isAlive);
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
     * @param aCouleur
     */
    public void setCouleur(Color aCouleur) {
		this.couleur = aCouleur;
	}

    /**
     *
     * @return
     */
    public String getName() {
		return this.name;
	}

    /**
     *
     * @param aName
     */
    public void setName(String aName) {
		this.name = aName;
	}
        
        // fait par teddy pour afficher le pion present dans une case
        @Override
	public String toString() 
	{
		return "Color : " +this.couleur + " Name : "+this.name;
	}
}