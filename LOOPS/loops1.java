package LOOPS;

            //for loop

import java.util.*;

public class loops1 {
    public static void main(String[] args) {
Scanner e = new Scanner(System.in);

int sum = 0;

System.out.print("Enter a number :");
int n = e.nextInt();

        for(int i=0; i<=n; i++){
            sum = sum + i;
        } 
        System.out.println("Printing sum of Natural numbers : " +sum);
    }

}
