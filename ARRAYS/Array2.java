    //TAKE AN ARRAY AS INPUT FROM USER AND SEARCH FOR A GIVEN NUMBER X AND PRINT THE INDEX AT WHICH ITS OCCUR

package ARRAYS;

import java.util.*;

public class Array2 {
    public static void main(String[] args) {        
Scanner sc = new Scanner(System.in);

System.out.print("Ente the size of the array :");
int size = sc.nextInt();

System.out.println("Enter the element numbers of array :");
int num[] = new int[size];
for(int i=0; i<size; i++){
    num[i] = sc.nextInt();
}
System.out.println("Enter the value for x: ");
int x = sc.nextInt();

for(int i=0; i<num.length; i++){
    if(num[i]==x){
        System.out.println("X found at Index :" +i);
    }
    else{
        System.out.println("X  not found.");
        
    }
}
    }    
}
