import java.util.Arrays;

public class BubbleSort {

 static void sort(int [] arrA){
 if(arrA==null || arrA.length==0)
 return;

 System.out.println("Original Array: " + Arrays.toString(arrA));
 int size = arrA.length;
 for (int i = 0; i <size–1 ; i++) {
 for (int j = 0; j <size–i–1 ; j++) {
 //check the adjacent elements
 if(arrA[j]>arrA[j+1]){
 //swap the elements
 int temp = arrA[j];
 arrA[j] = arrA[j+1];
 arrA[j+1] = temp;
 }
 }
 }
 System.out.println("Sorted Array : " + Arrays.toString(arrA));
 }

 public static void main(String[] args) {
 int [] arrA = {5, 1, 7, 3, 2, 10};
 sort(arrA);
 }
}
