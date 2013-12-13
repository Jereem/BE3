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
 * @author BE3 Group
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
    
    public void play(){
        Dice monDe = new Dice(1,6);
        //loop
        boolean isPlaying = true;
        while (isPlaying = true){
            for (Player elem : myPlayers) {
                // prend un joueur
                // lance le dès
                monDe.setValue();
                // avance le pion sur la case
                int index = ((LineBox)((SnakesAndLaddersPlayer)elem).getMyGamePiece().getCoordinates()).getIndex();
                int new_case = monDe.getValue()+index;
                ((SnakesAndLaddersPlayer)elem).getMyGamePiece().setCoordinate(myBoard.getPath(new_case));
                int mouvement = ((LineBox)((SnakesAndLaddersPlayer)elem).getMyGamePiece().getCoordinates()).getMouvement();
                //nouvelle valeur de la case : monDe.value + index;
                
                
                
                // prend l'echelle une fois le cas echeant
                // affiche plateau
                this.myBoard.putBoard();
                // verifie si gagnant
            
        }
        }
    }
    
    @Override
    public void putGame(){
         
                super.putGame();
                myBoard.putBoard();
            
    }
}
