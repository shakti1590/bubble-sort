// Java program for implementation of Bubble Sort
class BubbleSort {
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
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
		int arr[] = { 62, 34, 25, 12, 22, 10, 90 };
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
// Instead of searching an array as a whole, the bubble sort works by comparing adjacent pairs of objects in the array.  If the objects are not in the correct ordered, they are swapped so that the largest of the two moves up.
/* This code is contributed by shakti */
