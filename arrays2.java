
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of your array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Elements: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        int sum = findsum(arr);
        System.out.println("\nSum = " + sum);

        int max = findMax(arr);
        System.out.print("\nMax = " + max);
        sc.close();
    }

    static int findsum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
        }

        static int findMax(int [] arr){
            int max = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max)
                max = arr[i];
            }
            return max;
    }
}
