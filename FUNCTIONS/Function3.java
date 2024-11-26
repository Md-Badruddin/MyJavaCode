package FUNCTIONS;
import java.util.*;

public class Function3 {
    
    public static int multiply(int a, int b){
        int mult = a * b;
        return mult;
    }
public static void main(String[] args) {
    try (Scanner Sc = new Scanner(System.in)) {
        System.out.println("Enter the Numbers for a and b to Multiply : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        System.out.print("The Multiplication of two entered Numbers a and b is : " +multiply(a, b));
    }
}
}