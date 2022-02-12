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
public class Ellipse extends Shape implements Colour{
    
    private final double PI=3.14;
    
    public Ellipse(double diameterX, double diameterY){
        super(diameterX,diameterY);
    }
    
    @Override
    public double calculatePerimeter(){
        return 2*PI*Math.sqrt((((super.getHeight()/2)*(super.getHeight()/2))+((super.getWidth()/2)*(super.getWidth()/2)))/2);
    }
    
    @Override
    public double calculateArea(){
        return PI*(super.getHeight()/2)*(super.getWidth()/2);
    }
    
    @Override
    public String toString(){
        if(width==height)
        return "--------------------\n"+
               "Class name: Ellipse\n"+
               "The shape is a circle"+"\n"+
               "Height is "+super.getHeight()+" and width is "+super.getWidth()+"\n"+
               "Perimeter is "+ calculatePerimeter()+"\n"+
               "Area is "+ calculateArea();
               
        
        else
            return "--------------------\n"+
                   "Class name: Ellipse\n"+
                   "The shape is an ellipse"+"\n"+
                   "x-axis radius is "+(super.getHeight()/2)+" and y-axis radius is "+(super.getWidth()/2)+"\n"+
                   "Perimeter is "+ calculatePerimeter()+"\n"+
                   "Area is "+ calculateArea();
                   
        
    }
    
    @Override
    public void displayColour(){
        System.out.print(OUTPUT + super.getColour());
        
    }
    
}
