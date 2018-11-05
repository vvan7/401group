/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Viet
 */
public class Display {
    private final Scanner stdin = new Scanner(System.in);
    public String PlayerName(){
        System.out.println("Please enter the name of player: ");
            return stdin.next();
    }
    public int drawTicketCardAtBeginning(TicketCard tc1,TicketCard tc2,TicketCard tc3){
        System.out.println("a. "+tc1.toString());
        System.out.println("b. "+tc2.toString());
        System.out.println("c. "+tc3.toString());
        System.out.println("Please choose to keep:");
        System.out.println("1. All three.");
        System.out.println("2. a + b");
        System.out.println("3. a + c");
        System.out.println("4. b + c");
        return stdin.nextInt();
    }
    public void trainCardZone(TrainCardZone tcz){
        System.out.println(tcz.getCardArray());
    }
    public int drawTrainCard(){
        System.out.println("Please choose to draw:");
        System.out.println("1. Blind draw.");
        System.out.println("2. Face-up card draw.");
        return stdin.nextInt();
    }
    public int drawTrainCardfromZone(TrainCardZone tcz){
        System.out.println(tcz.getCardArray());
        System.out.println("Please pick the index to draw:");
        return stdin.nextInt();
    }
    
    public void printToString(String s) {
        System.out.println(s);
    }
    
    public void printPlayerInfo(String name, int score, List<TrainCard> hand1, List<TicketCard> hand2) {
        System.out.println(name + "'s turn!");
        System.out.println("Score: " + score);
        System.out.print("Train cards in hand:\n{");
        for(TrainCard card : hand1) {
            System.out.print(card.getValue());
        }
        System.out.print("}\nTicket cards in hand:\n{");
        for(TrainCard card : hand1) {
            System.out.print(card.getValue());
        }
        System.out.println("}");
    }
    
    public int promptAction() {
        System.out.println("Choose which action to take:");
        System.out.println("1. Draw train cards");
        System.out.println("2. Claim a path");
        System.out.println("3. Draw ticket cards");
        System.out.println("4. Skip turn");
        System.out.print("Choose number: ");
        return stdin.nextInt();
    }
    
    public void promptPath() {
        System.out.print("Choose which path to claim: ");
    }
    
    public int promptCity() {
        System.out.print("Choose city: ");
        return stdin.nextInt();
    }
    
    public int promptColor(VALUE value1, VALUE value2) {
        System.out.println("1. " + value1);
        System.out.println("1. " + value2);
        System.out.print("Choose color: ");
        return stdin.nextInt();
    }
    
    public int promptRemoveColor(VALUE color, List<TrainCard> hand) {
        int i = 0;
        System.out.println("Claiming " + color);
        System.out.println("-1. Done with claiming");
        for(TrainCard card : hand) {
            System.out.println(i + ". " + card.getValue());
            i++;
        }
        System.out.print("Choose card to remove: ");
        return stdin.nextInt();
    }
    
    public char promptToPlayAgain() {
        System.out.print("Play again? (Y/N): ");
        return stdin.next().charAt(0);
    }
}
