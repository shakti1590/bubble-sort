//importing java.util.Arrays class
import java.util.*;

// Java program for implementation of Bubble Sort
// Bubble sort is repeatedly swap two adjacent elements if they are in wrong order


class BubbleSort {
	void bubbleSort(int arr[]) 
	{
		int n = arr.length;
		
		//Bubble sort
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
				}
	}

	
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
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
