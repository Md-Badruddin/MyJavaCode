package LOOPS;

               // while loop

import java.util.*;

@SuppressWarnings("unused")
public class loops2 {
    public static void main(String[] args) {

@SuppressWarnings("resource")
Scanner s = new Scanner(System.in);

System.out.print("Enter a number for making its Table : ");
int n = s.nextInt();

int i =1;

while (i <= 10) {
    System.out.println(i * n);
    i++;
}

        
    }
}
