package OBJECT_ORIENTED_PROGRAMMING;
                    //INTERFACES

interface Animal{
    int eyes = 2;
}

interface Carnivore{
    }

class Omnivore implements Animal, Carnivore{

    public void walk() {
        System.out.println("Carnivore animals can eat the other animals meat.");
        System.out.println("Omnivore animals can eat the other animals meat and Vegetables.");
        System.out.println("All the animals have " +eyes +"eyes");

    }
}

public class OOPS8 {
    public static void main(String[] args) {
        
        Omnivore o1 = new Omnivore();
        o1.walk();
    }
    
}
