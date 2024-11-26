package FUNCTIONS;
import java.util.*;

public class Function2 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter the Numbers for a and b : ");
    int a = Sc.nextInt();
    int b = Sc.nextInt();

    System.out.print("The Sum of two Entered Numbers a and b is :"  +calculateSum(a, b));

}
}