import java.util.Arrays;
import java.util.Scanner;
public class BinSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();        

        int [] arr = new int [n];

        System.out.print("Enter the elements in a Sorted order: ");
        for(int i = 0; i < arr.length; i++){
            arr [i] = sc.nextInt();
        }

         Arrays.sort(arr);

        System.out.println("The elements are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the elements to search: ");
        int key = sc.nextInt();
        
        int result = binarySearch(arr, key);
        if (result == -1){
            System.out.println("Element is not found: ");
        } else {
            System.out.println("Element found at the index: " + result);
        }
    }

    static int binarySearch(int [] arr, int key){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right)/2;

            if (arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key)
                left = mid + 1; 
            
            else if(arr[mid] > key){
                right = mid -1;
            }
        }
        return -1;
    }
}
