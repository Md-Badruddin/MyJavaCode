//Printing the Table !

package If_Else.even;
import java.util.*;

public class Five {
    public static void main(String[] args) {
        
Scanner Sc = new Scanner(System.in);

System.out.println("Enter a Number to print its Table :");

int n = Sc.nextInt();

System.out.println("The Table of Entered Number is : ");

for(int i=1; i<=10; i++){
    System.out.println(n * i);
}

    }
}
