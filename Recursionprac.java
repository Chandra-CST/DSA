// // Recursion in java can be simply defined as a method (function) calling itself.
// //Applications of Recursion: Dynamic programming
//                          //  Backtracking
//                         //  Divide and Conquer Algos(Binary Search, Quick and Merge Sort)
// public class recsun {

//     // recursive function to find sum of n natural numbers
//     static int sum(int n) {
//         if (n == 0) {   // base case
//             return 0;
//         }
//         return n + sum(n - 1);  // recursive call
//     }

//     public static void main(String[] args) {
//         int n = 10;  // you can change this value
//         int result = sum(n);
//         System.out.println("Sum = " + result);
//     }
// }


// public class recsun{
//     static void fun(int n){
//         if (n == 0)
//         return ;
//         System.out.println(n);
//         fun (n-1);
//         System.out.println(n);
//     }
//     public static void main(String [] args){
//         fun(3);
//     }
// // }
// public class recsun{
//     static int fun (int n){
//            if (n == 0){
//             return 0;
//             } else {
//             return 1 + fun(n/2);
//         }
//     }
//     public static void main(String [] args){
//        int result = fun(10);
//        System.out.println(result);
//     }
// }
 
                // VOID PRINT

// public class recsun{
//     static void printNum(int n){
//         if (n == 0){  //base case
//             return;  ///recursive function
//         }
//             printNum(n - 1);
//             System.out.println(n);   
//     }
//     public static void main(String [] args){
//         printNum(10);
//     }
// // }
                  
           // SUM       

// public class recsun{
//     static int sum(int n){
//         if (n == 0) {    // base case
//             return 0;
//         }
//         return n + sum(n - 1);  //recursive function
//     }
//     public static void main(String [] args){
//         System.out.println("Sum" + sum(5));
//     }
// }
    // FACTORIAL

// public class recsun{
//     static int factorial(int n){
//         if (n==0){
//         return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void main(String [] args){
//         int result = factorial(5);
//         System.out.println(result);
//     }
// }

import java.util.Scanner;
public class recsun{
    static void printNum(int n){
        if(n == 0){
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        printNum(n);
    }
}
