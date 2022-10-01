/* The solution is about bubble sort implemetation using C-Plush_Plush*/

#include <bits/stdc++.h>
using namespace std;
 
// function to implement bubble sort
void bubbleSort(int arr[], int s)
{
    int i, j;
    for (i = 0; i < s - 1; i++)
 
        // Last i elements are already
        // in place
        for (j = 0; j < s - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]); //swap using inbuild Funtion defined in the headerfile <bits/stdc++.h>
}
 
// Function to print an array
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}
 
// Driver code
int main()
{
   int size;
   cin>>size; //User input of size of a array
   int arr[size];
   for(int i=0;i<size;i++)
   cin>>arr[i];
    bubbleSort(arr, size);
    cout << "Sorted array: \n";
    printArray(arr, size);
    return 0;
}

/* case-1:
Input: 6
8 97 2 0 4 2
OutPut: 0 2 24 8 97
Time complexity O(N^2)(N is the size of the array)
Space complexity O(1) */
