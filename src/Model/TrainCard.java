/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nguyenminhkhoa
 */

public class TrainCard {
    private VALUE color;


    public TrainCard(){
    }       

    public TrainCard(VALUE color){
        this.color = color;
    }
    
    public VALUE getValue(){
        return color;
    }
    
    @Override
    public String toString(){
        return color.toString();
    }
}
