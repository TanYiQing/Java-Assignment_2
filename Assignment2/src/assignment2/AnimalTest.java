/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AnimalTest {
    static Scanner input=new Scanner(System.in);
    static String name,sound,colour;
    static int numoflegs;
    static Animal[]animal=new Animal[3];
    static int i,a;
    
    public static void main(String[]args){    
        int ani=0;
        do{
        System.out.println("1. Cat\n2. Bird\n3. Armadillo");
        do{
            a=0;
        try{
        System.out.print("\nChoose an animal (1-3):");
        ani=input.nextInt();
        if(ani<1||ani>3)
            throw new IndexOutOfBoundsException();
        }catch(InputMismatchException ex){
            a=1;
            System.out.println("Invalid input. Enter 1-3 only");
            input.next();
        }catch (IndexOutOfBoundsException e) {
            a=1;
            System.out.println("Invalid input. Enter 1-3 only");
            input.nextLine();
        }
        
        if(ani==1){
            System.out.println("You've picked Cat");
            Input();
            animal[i]=new Cat(sound,colour);
            animal[i].setName(name);
            animal[i].setNumOfLegs(numoflegs);
            i++;          
        }
        else if(ani==2){
            System.out.println("You've picked Bird");
            Input();
            animal[i]=new Bird(sound,colour);
            animal[i].setName(name);
            animal[i].setNumOfLegs(numoflegs);
            i++;
        }
        else if(ani==3){
            System.out.println("You've picked Armadillo");
            Input();
            animal[i]=new Armadillo(sound,colour);
            animal[i].setName(name);
            animal[i].setNumOfLegs(numoflegs);
            i++;
        }
        }while(a==1); 
        
        }while(i<animal.length);
        Display();
        
    }
    
    
    public static void Input(){
        System.out.print("\nName\t\t\t:");
        name=input.next()+input.nextLine();
        System.out.print("Number of legs\t\t:");
        numoflegs=input.nextInt();
        System.out.print("Sound\t\t\t:");
        sound=input.next()+input.nextLine();
        System.out.print("Colour\t\t\t:");
        colour=input.next()+input.nextLine();
        System.out.println();
    }
    
    public static void Display(){
        System.out.println("*** LIST OF ANIMAL ***");
        for(int i=0;i<3;i++){
            if(animal[i] instanceof Cat){
                animal[i].displayAnimal();                
                ((Cat)animal[i]).displayIndoorHome();
                ((Cat)animal[i]).displayBoughtFood();
                
            }
            
            else if(animal[i] instanceof Bird){
                animal[i].displayAnimal();
                ((Bird)animal[i]).displayIndoorHome();
                ((Bird)animal[i]).displayBoughtFood();
                ((Bird)animal[i]).displayOutdoorHome();
                ((Bird)animal[i]).displayHuntFood();
            }
            
            else if(animal[i] instanceof Armadillo){
                animal[i].displayAnimal();
                System.out.println("Sound\t\t\t:"+sound.toUpperCase());
                System.out.println("Colour\t\t\t:"+colour.toUpperCase());
                System.out.println();
                ((Armadillo)animal[i]).displayOutdoorHome();
                ((Armadillo)animal[i]).displayHuntFood();
                
            }
        }
    }
}
