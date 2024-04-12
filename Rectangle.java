

package com.mycompany.inheritance;

public class Rectangle {
    private double  length;
    private double breadth;
    
    public Rectangle(){
        length=2;
        breadth=4;
    }
    public Rectangle(double length){
        this.length=length;
        breadth=4;
    }
    
  public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getRectangleArea(){
        return length*breadth;
    }
    public double getRectanglePerimeter(){
        return 2*(length + breadth);
    }
    
    
    
    
}
