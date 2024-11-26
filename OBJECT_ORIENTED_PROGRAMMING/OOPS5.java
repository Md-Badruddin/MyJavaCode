package OBJECT_ORIENTED_PROGRAMMING;
                    //Single, Multi-level, Hierarchial Inheritance.

class Shape{
    String color; 
    double l, b, h, r;
        public void colour(){
            System.out.println("Color of the Given Shape is :"+color);
    }   
}

class Triangle extends Shape{
        
        public void area(double l, double b){
            System.out.println("Area of the Triangle is : " +1/2*l*b);
        } 
}

class EquiTri extends Triangle{
        public void area(double h){
            System.out.println("Area of the EquiLateral Triangle is : " +h*h);
    } 
}

class Circle extends Shape{
        public void area(double r){
            System.out.println("Area of the circle is :" +3.14*r*r);
        }
}

public class OOPS5 {
    public static void main(String[] args) {
        System.out.println("Printing the Information about the given shapes.");

    Shape S1 = new Shape();
    S1.color = "Red";
    S1.colour();

    EquiTri eq = new EquiTri();
    eq.h = 5;
    eq.area(eq.h);
    eq.color = "Purple";
    eq.colour();   
    }   
}