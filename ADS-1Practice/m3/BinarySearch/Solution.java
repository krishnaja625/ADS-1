import java.util.Scanner;
import java.util.Arrays;
class Solution{
Solution() {

}
/**
 * function for main.
 *
 * @param      args  The arguments
 */
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
  int size = s.nextInt();
int arr[] = new int[size];
for(int i= 0; i<arr.length; i++) {
	arr[i] = s.nextInt();
}
 System.out.println("enter the search element");
Arrays.sort(arr);
int a = binarySearch(arr, 0, arr.length - 1, s.nextInt());
if (a == -1) {
	System.out.println("element not present in the array");
} else {
	System.out.println("element is present" + a);
}
System.out.println();
}
static int binarySearch(int arr[], int startIndex, int endIndex, int x) 
{ 
   if (endIndex >= startIndex) 
   { 
        int mid = startIndex + (endIndex - startIndex)/2;
        if (arr[mid] == x)   
            return mid;
        if (arr[mid] > x)  
            return binarySearch(arr, startIndex, mid-1, x);  
        return binarySearch(arr, mid+1, endIndex, x); 
   } 
  return -1; 
} 
}
