/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ga1_group7;

public class GA1_Group7 {

    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cylinder cylinder = new Cylinder(5, 10);
        Cone cone = new Cone(5, 10);
        
        System.out.printf("Sphere Volume: %.4f\n" , sphere.calculateVolume());
        System.out.printf("Sphere Surface Area: %.4f\n", sphere.calculateSurfaceArea());
        
        System.out.printf("Cylinder Volume: %.4f\n" , cylinder.calculateVolume());
        System.out.printf("Cylinder Surface Area: %.4f\n", cylinder.calculateSurfaceArea());
        
        System.out.printf("Cone Volume: %.4f\n" , cone.calculateVolume());
        System.out.printf("Cone Surface Area: %.4f\n", cone.calculateSurfaceArea());
        
        
    }

}

interface ThreeD_Shapes{
    double calculateVolume();
    double calculateSurfaceArea();
}

class Sphere implements ThreeD_Shapes{
    private double r;
     
    public Sphere(double r){
        this. r = r;
    }

    @Override
    public double calculateVolume() {
        return (4.0/3) * Math.PI * Math.pow(r,3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(r,2);
    }
    
}

class Cylinder implements ThreeD_Shapes{
    private double r;
    private double h;
    
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        // volume formula = pi x r^2x h
        return Math.PI*Math.pow(r, 2)*h;
    }

    @Override
    public double calculateSurfaceArea() {
        // area formula = (2 x pi x r x h) + (2 x pi x r^2)
        return (2*Math.PI*r*h) + (2*Math.PI*Math.pow(r,2));
    }
    
}

class Cone implements ThreeD_Shapes{
    private double r; 
    private double h;
    
    public Cone(double r, double h){
        this.r = r;
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        double V = ((1.0/3.0) * Math.PI * Math.pow(r, 2) * h);
        return V;
    }

    @Override
    public double calculateSurfaceArea() {
        double A = (Math.PI * r * (r + Math.sqrt(Math.pow(r,2) + Math.pow(h,2))));
        return A;
    }
    
}

