/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circles;

/**
 *
 * @author admin
 */
public class circle {
     private double radius;
    double circumference;
    double area;
    double diameter;
    
     public circle() {
        this.radius = 1.0;
    }

    // Parameterized Constructor
    public circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        
    double v= Math.pow(radius, 2);
    double c=Math.PI*v;
    return c;
            
}
    public double diameter(){
        double n=radius*2;
        return n;
    }
    public double circumference(){
        double m =2*Math.PI*radius;
        return m;
        
            
    } public double Radius() {
        return radius;
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}