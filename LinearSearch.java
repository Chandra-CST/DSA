import java.util.Scanner;

public class LinSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int [] arr = new int[n];

        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Elements are: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int sum = findSum(arr);
        System.out.print("\nThe Sum of array is : "  + sum);

        System.out.print("\nEnter Elements to Search: ");
        int key = sc.nextInt();

        int result = LinearSearch(arr, key);

        if (result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int findSum(int [] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    static int LinearSearch(int [] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }	
}
