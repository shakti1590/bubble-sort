import java.util.Arrays;

// Java program for implementation of Bubble Sort
class BubbleSort {
	void bubbleSort(int arr[])
	{
		System.out.println("Original Array: " + Arrays.toString(arr));
		if(arr==null || arr.length==0)
			return;
		boolean is_swapped=false;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			is_swapped=false;
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					is_swapped=true;
				}
			if(is_swapped==false)
				break;
		}
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

	// /* Prints the array */
	// void printArray(int arr[])
	// {
	// 	int n = arr.length;
	// 	for (int i = 0; i < n; ++i)
	// 		System.out.print(arr[i] + " ");
	// 	System.out.println();
	// }

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = { 62, 34, 25, 12, 22, 10, 90 };
		ob.bubbleSort(arr);
		// System.out.println("Sorted array");
		// ob.printArray(arr);
	}
}

/* This code is contributed by shakti */
