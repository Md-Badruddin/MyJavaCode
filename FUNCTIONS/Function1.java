package FUNCTIONS;
import java.util.*;

public class Function1 {
    public static String printMyName(String name){
    
        return name;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = Sc.next();

        System.out.print("Your entered name is : "+printMyName(name));


    }
    
}
