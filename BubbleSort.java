import java.util.Scanner;
public class bubblesort{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

         System.out.print("Enter Values: ");
         for(int i = 0; i < n; i++)
         arr[i] = sc.nextInt();

          System.out.print("\nThe Elements of array are: ");
             for(int i = 0; i < arr.length; i++)
              System.out.println(arr[i]+" ");

          bubblesort(arr);

          System.out.print("\nThe Elements after sorting are: ");
             for(int i = 0; i < arr.length; i++)
              System.out.println(arr[i]+" ");
    }
    static void bubblesort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
              boolean swapped = false;
            for(int j = 0; j < n - 1- i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            
            if (swapped==false){
                break;
            }
        }
    }
}
