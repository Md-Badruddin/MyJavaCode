package If_Else;
import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");

        int x = Sc.nextInt();

        if(x%2==0 && x>=0){
            System.out.println("The Entered number is Even.");

        if(x%2>=0){
            System.out.println("The entered number is also a positive number. ");
        }
        else if(x<0){
            System.out.println("You have entered a negative number ");
        }
    }
        else {
            System.out.println("The Entered number is Odd.");
        }
    }
}
