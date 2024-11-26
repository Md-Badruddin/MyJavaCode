//Loops !

package If_Else.even;
import java.util.*;

public class Four {

public static void main(String[] args) {

    // for(int i=0; i<=10; i++){
    //     System.out.println("Hello World !");
    // }

    // System.out.println("The Above Hello World Printed 10 Times !");


//Sum of n numbers using loop !

Scanner Sc = new Scanner(System.in);
System.out.println("Enter a Number n : ");
int n = Sc.nextInt();

int sum = 0;

for(int i=0; i<=n; i++){
        sum = sum + i;
}

System.out.println("The sum of entered n Numbers is : ");
System.out.print(sum);

}
}
