import java.util.*;
public class BubbleSort {

    public static int[] BubbleSort(int arr[]) {
        //Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        System.out.println("Sorted Array using bubble Sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        BubbleSort(arr);

        printArray(arr);

        //Time Complexity : O(N^2)
    }
}
