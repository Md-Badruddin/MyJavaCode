package If_Else;
//2. Write a JAVA program for multiplication of two arrays.


import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        // Multiply the arrays element-wise and store the result in a third array
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        // Print the result array
        System.out.println("Result of array multiplication:");
        for (int i = 0; i < size; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
	}


