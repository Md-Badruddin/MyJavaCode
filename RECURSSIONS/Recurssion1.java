package RECURSSIONS;

public class Recurssion1 {

        public static void printNm(int n){
            if(n == 0){
                return;
            }                                 //Printing numbers from 5 to 1.
            System.out.println(n);
            printNm(n - 1);
        }

public static void printNum(int m){
        if(m == 6){
            return;
        }                                       //Printing numbers from 1 to 5.
        System.out.println(m);
        printNum(m + 1);
}




            public static void main(String[] args) {
                int n = 5;
                int m = 0;
                    printNm(n);
                    printNum(m);
            }

}
