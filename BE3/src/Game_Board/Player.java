package Game_Board;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author BE3 Group
 */
public class Player {

    private String myName;
    private Color myColor;
    private int winCounter;
    private int nbPoint;

    /**
     *
     */
    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your nickname :");
        String str = sc.nextLine();
        System.out.println("Your nickname is : " + str);
        this.myName = str;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter your color (BLACK, WHITE, RED, BLUE, GREEN, YELLOW, ORANGE, PINK) :");
        String str2 = sc.nextLine();
        String color = str2.toUpperCase();
        System.out.println("Your color is : " + color);
        switch (color) {
            case "BLACK":
                this.myColor = Color.BLACK;
                break;
            case "WHITE":
                this.myColor = Color.WHITE;
                break;
            case "RED":
                this.myColor = Color.RED;
                break;
            case "BLUE":
                this.myColor = Color.BLUE;
                break;
            case "GREEN":
                this.myColor = Color.GREEN;
                break;
            case "YELLOW":
                this.myColor = Color.YELLOW;
                break;
            case "ORANGE":
                this.myColor = Color.ORANGE;
                break;
            case "PINK":
                this.myColor = Color.PINK;
                break;
            default:
                System.out.println("COLOR ERROR, please try again");
                sc.nextLine();
        }
        this.winCounter = 0;
    }

    /**
     *
     * @param n
     * @param c
     */
    public Player(String n, Color c) {
        this.myName = n;
        this.myColor = c;
        this.winCounter = 0;
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
        this.winCounter += 1;
    }
    
    public void putPlayer(){
        System.out.println();
    }
}
