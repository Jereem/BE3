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
        this.myRules = "Snakes and ladders Rules";
    }
    
    public void play(){
        Dice monDe = new Dice(1,6);
        //loop
        boolean isPlaying = true;
        int test = -1;
        int index = 0;
        while (isPlaying == true) {
                // on prend un joueur
            for (Player elem : myPlayers) {
                test++;
                System.out.println("-- test -- " + test);
                // lance le dès
                monDe.setValue();
                // avance le pion sur la case
                //int index = ((LineBox)((SnakesAndLaddersPlayer)elem).getMyGamePiece().getCoordinates()).getIndex();             
                // nouvelle valeur de la case : monDe.value + index;
                int new_case = monDe.getValue()+index;
                // on déplace le pion
                if (new_case>30){new_case = 30;}
                ((SnakesAndLaddersPlayer)elem).getMyGamePiece().setCoordinates(myBoard.getPath(new_case));
                // on récupère sa nouvelle case
                index = ((LineBox)((SnakesAndLaddersPlayer)elem).getMyGamePiece().getCoordinates()).getIndex();
                // on récupère le mouvement associé
                int mouvement = ((LineBox)((SnakesAndLaddersPlayer)elem).getMyGamePiece().getCoordinates()).getMouvement();
                // on calcul la valeur de la nouvelle case + mouvement
                new_case = index + mouvement;
                // on re déplace le pion
                if (new_case>30){new_case = 30;}
                ((SnakesAndLaddersPlayer)elem).getMyGamePiece().setCoordinates(myBoard.getPath(new_case));
                if(new_case>=30){
                isPlaying = false;
                elem.setWinning_counter();
                System.out.println("Player " + elem.getName() + " won !!");
                break;
                }
                // affiche plateau
                this.myBoard.putBoard();  
            }
        }
        }
    
    @Override
    public void putGame(){
         
                super.putGame();
                myBoard.putBoard();
            
    }
}
