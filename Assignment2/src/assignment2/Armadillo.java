/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author user
 */
public class Armadillo extends Animal implements Wild{
    private String sound;
    private String colour;
    
    public Armadillo(String sound, String colour){
        this.sound=sound;
        this.colour=colour;
    }
    
    @Override
    public void displayOutdoorHome(){
        System.out.println(super.getName()+" is a wild armadillo");
        System.out.println(super.getName()+" stays in the "+ HOME);
        
    }
    
    @Override
    public void displayHuntFood(){
        System.out.println(super.getName()+" catch " +FOOD+" using its long and sticky tongue");
        System.out.println();
        
    }
    
    
}
