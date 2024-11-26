package OBJECT_ORIENTED_PROGRAMMING;
                //ABSTRACTION

import Animal;

abstract class Animal{
        String color;
    
    public void walk(){
        System.out.println("Animals have legs.");
    }
    Animal(){
        System.out.println("First the Constructor of an Animal is called.");
    }
} 

class Horse extends Animal{
        public void walk(){
            System.out.println("Horse can walk on four legs. ");
            System.out.println("Color of the Horse is :. " +color);
        }

    Horse(){
        System.out.println("Second the Constructor of an Subclass of Animal i.e the Horse is called.");
    }
}

public class OOPS7 {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        Horse h1 = new Horse();
        h1.color = "Grey White";
        h1.walk();
    }
    
}
