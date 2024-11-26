package FUNCTIONS;
// Factorial of a number !

import java.util.*;

public class Function4{

    public static void printFactorial(int n){
        int factorial = 1;

    for(int i=n; i>=1; i--){
            factorial = factorial * i;
        } 
        System.out.print(factorial);
    }
public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);

System.out.println("Enter a number for n to print its Factorial : ");
int n = Sc.nextInt();

System.out.print("The factorial of an entered n number is : ");

printFactorial(n);

}
    }