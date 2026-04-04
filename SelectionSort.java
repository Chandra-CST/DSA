import java.util.Scanner;
public class selectionsort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the values: ");
        for(int i = 0; i< arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("The elements are: ");
        for(int i = 0; i < arr.length; i++)
        System.out.println(arr[i]+"");

        selectionsort(arr);
         System.out.print("\nThe Elements after sorting are: ");
             for(int i = 0; i < arr.length; i++)
              System.out.println(arr[i]+" ");
    }
    static void selectionsort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;   //assumes current index is the smallest.
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap once after finding min
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
