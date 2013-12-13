
package Game_Board;

import java.awt.Color;

/**
 *
 * @author teddy.delavallee
 */
public class Player {
	private String myName;
	private Color myColor;
	private int winCounter;
        // private int nbPoint;

    /**
     *
     */
    public Player(){
            this.myName="anonymous";
            this.myColor=Color.BLACK;
            this.winCounter=0;
        }

    /**
     *
     * @param n
     * @param c
     */
    public Player(String n, Color c){
            this.myName=n;
            this.myColor=c;
            this.winCounter=0;
        }

    /**
     *
     * @return
     */
    public String getName() {
		return this.myName;
	}

    /**
     *
     * @param aAttribute
     */
    public void setName(String aAttribute) {
		this.myName = aAttribute;
	}

    /**
     *
     * @return
     */
    public Color getColor() {
		return this.myColor;
	}

    /**
     *
     * @param aColor
     */
    public void setColor(Color aColor) {
		this.myColor = aColor;
	}

    /**
     *
     * @return
     */
    public int getWinning_counter() {
		return this.winCounter;
	}

    /**
     *
     */
    public void setWinning_counter() {
		this.winCounter +=1;
	}
}