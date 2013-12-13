/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Board;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author teddy.delavallee
 */
public class SnakesAndLaddersGame extends Game {
    private SnakesAndLaddersBoard myBoard;

    public SnakesAndLaddersGame() {
        this.myBoard = new SnakesAndLaddersBoard();
        this.myPlayers = new ArrayList<>();
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Players number (min: 2 / max: 8):");
        int str = sc0.nextInt();
        if (str < 2 || str > 8) {
            sc0.nextInt();
        }
        System.out.println("Players number : " + str);
        for (int i = 0; i < str; i++) {
            SnakesAndLaddersPlayer pPlayer = new SnakesAndLaddersPlayer();
            this.myBoard.getPath(0).addGamePiece(pPlayer.getMyGamePiece());
            myPlayers.add(pPlayer);
            System.out.println(i);
        }
        this.isAlive = true;
        this.myRules = "Snakes and ladders Rules";
    }
    
    @Override
    public void putGame(){
        for (Player elem : myPlayers) {
                super.putGame();
                myBoard.putBoard();
            }
    }
}
