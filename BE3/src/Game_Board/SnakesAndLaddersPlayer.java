/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game_Board;

/**
 *
 * @author teddy.delavallee
 */
public class SnakesAndLaddersPlayer extends Player{
    private Game_Piece myGamePiece;
    
    public SnakesAndLaddersPlayer(){
        super();
        myGamePiece = new Game_Piece(this);
    }
    
    public Game_Piece getMyGamePiece(){
        return myGamePiece;
    }
}
