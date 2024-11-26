  //PRINTING THE MARKS OF A STUDENT BY GIVING THE INPUT.

package ARRAYS;

import java.util.*;

@SuppressWarnings("unused")
public class Array1 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter the USN of the Student :");
    String stu = sc.nextLine();

    System.out.println("Enter the marks for 3 Subject : ");

    //INPUT
    int marks[] = new int[3];
    for(int i=0; i<3; i++){
        marks[i] = sc.nextInt();
    }

System.out.println("The entered USN is :" +stu);

    //OUTPUT
    System.out.println("The entered marks is :");
    for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
        
    }
}
    }
