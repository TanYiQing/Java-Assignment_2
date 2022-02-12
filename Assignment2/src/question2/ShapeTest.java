/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ShapeTest {
    static Scanner input = new Scanner (System.in);
    static Shape[]shape=new Shape[5];
    static int i,a;
    
    public static void main(String[]args){
        int square=0;
        int triangle=0;
        int ellipse=0;
        int choice=0;
        do{
        System.out.println("1. Square\n2. Triangle\n3. Ellipse\n");
        do{
            a=0;
        try{
        System.out.print("Select a shape: ");
        choice=input.nextInt();
        if(choice<1||choice>3)
            throw new IndexOutOfBoundsException();
        }catch(InputMismatchException e){
            a=1;
            System.out.println("Invalid input. Enter 1-3 only\n");
            input.next();
            
        }catch(IndexOutOfBoundsException ex){
            a=1;
            System.out.println("Invalid input. Enter 1-3 only\n");
            input.nextLine();
        }
        
        if(choice==1){
                try {
                    if(square>1)
                        throw new Exception();
                    System.out.println("You've selected Square");
                    inputSquare();
                    i++;
                    square++;
                    
                } catch (Exception ex) {
                    System.out.println("Memory is full");
                    System.out.println();
                }
        }
        else if(choice==2){
            try {
            if(triangle>1)
                        throw new Exception();
            System.out.println("You've selected Triangle");
            inputTriangle();
            i++;
            triangle++;
        } catch (Exception ex) {
                    System.out.println("Memory is full");
                    System.out.println();
        }
        }
        else if(choice==3){    
            try {
            if(ellipse>1)
                        throw new Exception();
            System.out.println("You've selected Ellipse");
            inputEllipse();
            i++;
            ellipse++;
        } catch (Exception ex) {
                    System.out.println("Memory is full");
                    System.out.println();
        }
        }
        }while(a==1);
        }while(i<shape.length);
        
        display();
    }
    
    public static void inputSquare(){
        System.out.print("\nEnter height:\t");
        double height = input.nextDouble();
        System.out.print("Enter width:\t");
        double width = input.nextDouble();
        System.out.print("Enter colour:\t");
        String colour = input.next()+input.nextLine();
        System.out.println();
        shape[i]=new Square(height,width);
        shape[i].setColour(colour);
        shape[i].calculatePerimeter();
        shape[i].calculateArea();
        
    }

    public static void inputTriangle() {
        System.out.print("\nEnter side:\t");
        double width = input.nextDouble();
        double height=(width*width)-((width/2)*(width)/2);
        System.out.print("Enter colour:\t");
        String colour = input.next()+input.nextLine();
        System.out.println();
        shape[i]=new Triangle(height,width);
        shape[i].setColour(colour);
        shape[i].calculatePerimeter();
        shape[i].calculateArea();
        
    }
    
    public static void inputEllipse(){
        System.out.print("\nEnter x-axis diameter: ");
        double x=input.nextDouble();
        System.out.print("Enter y-axis diameter: ");
        double y=input.nextDouble();
        System.out.print("Enter colour:\t\t ");
        String colour=input.next()+input.nextLine();
        System.out.println();
        shape[i]=new Ellipse(x,y);
        shape[i].setColour(colour);
        shape[i].calculatePerimeter();
        shape[i].calculateArea();
        
    }
    
    public static void display(){
        System.out.println(" *** DETAILS OF SHAPE ***");
        for(int i=0;i<shape.length;i++){
            if(shape[i] instanceof Square){
                System.out.println(shape[i].toString());
                ((Square)shape[i]).displayColour();
                System.out.println();
            }
            
            else if(shape[i] instanceof Triangle){
                System.out.println(shape[i].toString());
                ((Triangle)shape[i]).displayColour();
                System.out.println();
            }
            
            else if(shape[i] instanceof Ellipse){
                System.out.println(shape[i].toString());
                ((Ellipse)shape[i]).displayColour();
                System.out.println();
            }
        }
    }
        
}
    

