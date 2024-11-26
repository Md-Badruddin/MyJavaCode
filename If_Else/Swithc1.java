package If_Else;

import java.util.*;

@SuppressWarnings("unused")
public class Swithc1 {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number for days :");
    int days = sc.nextInt();

    switch (days) {
        case 1:System.out.println("You have entered 1. the day is Sunday");
            break;

        case 2:System.out.println("You have entered 2. the day is Monday");
            break;

        case 3:System.out.println("You have entered 3. the day is Tuesday");
            break;  
            
        case 4:System.out.println("You have entered 4. the day is Wednesday");
            break;   
            
            
            
        default:System.out.println("You have entered a valid number.");
            break;
    }

    }
}
