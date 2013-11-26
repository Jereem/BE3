package Game_Board;

import java.awt.Color;


public class Player {
	private String myName;
	private Color myColor;
	private int winCounter;
        // private int nbPoint;
        
	

        public Player(){
            this.myName="jeje";
            this.myColor=Color.BLACK;
            this.winCounter=0;   
        }
                
	public String getName() {
		return this.myName;
	}

	public void setName(String aAttribute) {
		this.myName = aAttribute;
	}

	public Color getColor() {
		return this.myColor;
	}

	public void setColor(Color aColor) {
		this.myColor = aColor;
	}

	public int getWinning_counter() {
		return this.winCounter;
	}

	public void setWinning_counter(int aWinning_counter) {
		this.winCounter = aWinning_counter;
	}
}