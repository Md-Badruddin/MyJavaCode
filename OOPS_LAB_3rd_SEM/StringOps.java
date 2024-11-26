package OOPS_LAB_3rd_SEM;

/* 2. Write a program in Java for String handling which performs the following: 
i) Checks the capacity of String Buffer objects. 
ii) Reverses the contents of a string given on console and converts the resultant string in upper case. 
iii) Reads a string from console and appends it to the resultant string of ii. 
*/

import java.util.Scanner;
public class StringOps
{
public static void main(String [] args)
{
StringBuffer s = new StringBuffer();

String str2;

Scanner input = new Scanner(System.in);

s.append("Java Programming");
System.out.println("The current capacity of StringBuffer is: "+s.capacity());

System.out.println("Initial string without append: "+s);

System.out.println("Enter a string to append:");
str2 = input.nextLine();

s.append(" "+str2);
System.out.println("Initial string with append:"+s);

s.reverse();
System.out.println("Initial string after reversing:"+s);

int i=0;

do{
s.replace(i,i+1,s.substring(i,i+1).toUpperCase());
i=i+1;
}
while(i>0 &&i<s.length());
System.out.println("After reversing and converting to upper case:"+s);
}
}

