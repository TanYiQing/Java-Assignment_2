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
public class Animal {
    String name;
    int numOfLegs;
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setNumOfLegs(int legs){
        this.numOfLegs=legs;
    }
    
    public int getNumOfLegs(){
        return numOfLegs;
    }
    
    public void displayAnimal(){
        System.out.println("Name\t\t\t:"+name.toUpperCase());
        System.out.println("Number of legs\t\t:"+numOfLegs);
        
        
    }
}
