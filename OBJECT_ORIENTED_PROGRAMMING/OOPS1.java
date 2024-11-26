package OBJECT_ORIENTED_PROGRAMMING;
            //class and objects

class pen{
    String color;
    String type;

public void PrintPenInfo(){

System.out.println("Printing Information of Pen !");
System.out.println("Color of the pen is " +this.color);
System.out.println("Type of the pen is "+this.type);
}

}

public class OOPS1 {
    public static void main(String[] args) {
        pen pen1 = new pen();

        pen1.color = "Green";
        pen1.type = "Ball pen";

pen1.PrintPenInfo();

    }

}
