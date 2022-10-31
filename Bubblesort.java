//importing java.util.Arrays class
import java.util.*;


class BubbleSort {

	void bubbleSort(int arr[]) 
	{
		//Bubble sort
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					swap(arr, j);
				}
	}

	// separation into own method makes code more readable.
	private void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
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
		BubbleSort sort = new BubbleSort();
		Scanner scanner=new Scanner(System.in);
		int inputSize = scanner.nextInt();
		int[] input = new int[inputSize];
		for(int i=0; i<inputSize; i++)
        {  
        	input[i]=scanner.nextInt();
        } 
		System.out.println("Input array");
		sort.printArray(input);
		sort.bubbleSort(input);
		System.out.println("Sorted array");
		sort.printArray(input);
	}
}
/* This code is contributed by Shakti */
