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
public class Bird extends Animal implements Domestic,Wild{
    private String sound;
    private String colour;
    
    public  Bird(String sound, String colour){
        this.sound=sound;
        this.colour=colour;
    }
    
    @Override
    public void displayIndoorHome(){
        System.out.println(super.getName()+" is a pet bird");
        System.out.println(super.getName()+" stays in the "+Domestic.HOME);
        
    }
    
    @Override
    public void displayOutdoorHome(){
        System.out.println(super.getName()+" can also be a wild bird");
        System.out.println(super.getName()+" stays in the "+Wild.HOME);
    }
    
    @Override
    public void displayBoughtFood(){
        System.out.println(super.getName()+" eats "+Domestic.FOOD);
        System.out.println();
    }
    
    @Override
    public void displayHuntFood(){
        System.out.println(super.getName()+" flies in the forest to find food and likes to eat "+Wild.FOOD);
        System.out.println();
    }
    
    @Override
    public void displayAnimal(){
        super.displayAnimal();
        System.out.println("Sound\t\t\t:"+sound.toUpperCase());
        System.out.println("Colour\t\t\t:"+colour.toUpperCase());
        System.out.println();
        
    }
    
}
