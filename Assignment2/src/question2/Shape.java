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
public abstract class Shape {
    double height;
    double width;
    private String colour;
    
    public Shape(double height,double width){
        this.height=height;
        this.width=width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setColour(String colour){
        this.colour=colour;
    }
    
    public String getColour(){
        return colour.toLowerCase();
    }
    
    public abstract double calculatePerimeter();
    
    public abstract double calculateArea();
    
    
    
}
