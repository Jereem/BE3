/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import Game_Board.*;
import java.util.*;
        



/**
 *
 * @author jeremygillet
 */
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
    
    // Demander la partie jouée (échecs ou snake and ladders)
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to GPhy Game !");
    System.out.println("List of games : ");
    System.out.println("\t 0 - Exit to GPhy Game");
    System.out.println("\t 1 - Checkers");
    System.out.println("\t 2 - Snake and ladders");
    

    int str;
        str = sc.nextInt();
            
    System.out.println("You enter : " + str);
    switch (str){
    case 0: 
        System.out.println("GAME OVER"); 
        System.exit(1);
         break ;
    case 1:
        System.out.println("CHECKERS"); 
    break;
    case 2:
        System.out.println("SNAKE AND LADDERS");
        
    // ------- SNAKE AND LADDERS --------
    // Demander le nombre de joueur
    
    
    
    // Demander le pseudo et la couleur de chacun des joueurs //loop sur le nombre de joueurs
    
    
    
    // Creer la partie avec la liste des joueurs créés et le plateau adéquat
    /*
    ArrayList<Player> p; //liste des joueurs
    String s="coucou"; //règles du jeu
    Board b; //plateau utilisé
    Game g = new Game(p,b,s);
    Dice deSixFaces = new Dice(1,6); // dé utilisé pour la partie
    */
    
    //début du tour
    
        //lancé de dés
    
            //case courante += dés puis += case.action
    
            //Si sur dernière case --> fin de la partie
    
            //Si nouveauNumeroCase>taillePlateau --> nouvelle case = taillePlateau - (nouveauNumeroCase - taille plateau)
                //puis += case.action
    
        
        
        
        
    break;
    default:
        System.out.println("ERROR please try again"); sc.nextInt();

    }


    
    
    
    
    }
}
