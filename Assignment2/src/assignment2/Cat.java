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
public class Cat extends Animal implements Domestic{
    private String sound;
    private String colour;
    
    public Cat(String sound, String colour){
        this.sound=sound;
        this.colour=colour;
    }
    
    @Override
    public void displayIndoorHome(){
        System.out.println(super.getName()+" is a pet cat");
        System.out.println(super.getName()+" stays in the "+Domestic.HOME);
    }
    
    @Override
    public void displayBoughtFood(){
        System.out.println(super.getName()+" likes to eates tuna, salmon and chicken "+Domestic.FOOD);
        System.out.println();
    }
    
    @Override
    public void displayAnimal(){
        super.displayAnimal();
        System.out.println("Sound\t\t\t:"+sound.toUpperCase());
        System.out.println("Colour\t\t\t:"+colour.toUpperCase()+"\n");
    }
    
}
