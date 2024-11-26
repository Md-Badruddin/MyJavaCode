package DESIGNS;
//6. Write a JAVA program demonstrating Method overloading and Constructor overloading.


public class Overloading {
	public Overloading() {
        System.out.println("Constructor with no arguments called.");
    }

    public Overloading(int num) {
        System.out.println("Constructor with one argument called. Argument: " + num);
    }

    public Overloading(int num1, int num2) {
        System.out.println("Constructor with two arguments called. Arguments: " + num1 + ", " + num2);
    }

    // Method Overloading
    public void display() {
        System.out.println("Method with no arguments called.");
    }

    public void display(int num) {
        System.out.println("Method with one argument called. Argument: " + num);
    }

    public void display(int num1, int num2) {
        System.out.println("Method with two arguments called. Arguments: " + num1 + ", " + num2);
    }

	public static void main(String[] args) {
		Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading(10);
        Overloading obj3 = new Overloading(20, 30);

        obj1.display();
        obj2.display(50);
        obj3.display(70, 80);
    }

	}


