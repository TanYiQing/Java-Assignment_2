/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author user
 */
public class Triangle extends Shape implements Colour {
    private final double CALC=0.5;

    public Triangle(double height, double width){
        super(Math.sqrt(height),width);
    }

    @Override
    public double calculatePerimeter(){
        return super.getWidth()*3;
    }
    
    @Override
    public double calculateArea(){
        return (height*super.getWidth())*CALC;
    }
    
    @Override
    public String toString(){
        return "--------------------\n"+
               "Class name: Triangle\n"+
               "Height is "+super.getHeight()+" and width is "+super.getWidth()+"\n"+
               "Perimeter is "+ calculatePerimeter()+"\n"+
               "Area is "+ calculateArea();
    }
    
    @Override
    public void displayColour(){
        System.out.println(OUTPUT+super.getColour());
    }
}
