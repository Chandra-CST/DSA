Q1: Take 2 input integers and find their product:
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int n = sc.nextInt();

        System.out.print("Enter your second value: ");
        int m = sc.nextInt();

        int j = m * n;
        System.out.println("The product of both integers is: " + j);
        sc.close();
    }
}
Q2: Take string as an input and print hello before that string:
import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String s = sc.nextLine();

        System.out.print("Welcome " + s + "! ");
    }
}
Q3: Task

Write a program that:

// Takes the size of the array (n).
// Creates an array of size n.
// Takes all n elements as input.
// Prints all the elements on one line, separated by a space.  


import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
        System.out.println(arr[i] + " ");
        }
    }
}
