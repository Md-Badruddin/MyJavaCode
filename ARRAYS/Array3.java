package ARRAYS;

import java.util.*;

public class Array3 {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Rows :");
        int row = sc.nextInt();

        System.out.println("Enter the no. of Columns :");
        int col = sc.nextInt();

        System.out.println("Enter the elements for matrix : ");
        int num[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println(num[i][j] + " ");
            }
            System.out.print(0);
        }




    }

    
}
