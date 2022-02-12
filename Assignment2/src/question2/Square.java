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
public class Square extends Shape implements Colour{
    public Square(double height, double width){
        super(height,width);
    }
    
    @Override
    public double calculatePerimeter(){
        return (height*2)+(width*2);
    }
    
    @Override
    public double calculateArea(){
        return height*width;
    }
    
    @Override
    public String toString(){
        if(width==height)
        return "--------------------\n"+
               "Class name: Square\n"+
               "The shape is a square\n"+
               "Height is "+super.getHeight()+" and width is "+super.getWidth()+"\n"+
               "Perimeter is "+ calculatePerimeter()+"\n"+
               "Area is "+ calculateArea();
               
        
        else
            return "--------------------\n"+
                   "Class name: Square\n"+
                   "The shape is a rectangle\n"+
                   "Height is "+super.getHeight()+" and width is "+super.getWidth()+"\n"+
                   "Perimeter is "+ calculatePerimeter()+"\n"+
                   "Area is "+ calculateArea();
                   
        
    }
    
    @Override
    public void displayColour(){
        System.out.println(OUTPUT+super.getColour());
    }
    
}
