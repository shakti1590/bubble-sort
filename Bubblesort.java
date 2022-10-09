//importing java.util.Arrays class
import java.util.*;

// Java program for implementation of Bubble Sort
// Bubble sort is repeatedly swap two adjacent elements if they are in wrong order
//Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.

class BubbleSort {
	void bubbleSort(int arr[]) 
	{
		
		//Bubble sort
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
				}
	}

	//method to print the array
	void printArray(int arr[])
	{
		
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		// taking array as input
		Scanner sc=new Scanner(System.in);
		//size of input array
		int p=sc.nextInt();
		int[] arr = new int[p];  
		for(int i=0; i<p; i++)  
        {  
        	arr[i]=sc.nextInt();  
        } 
		//printing input array
		System.out.println("Input array");
		ob.printArray(arr);
		//calling bubble sort
		ob.bubbleSort(arr);
		//printing sorted array
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Shakti */
