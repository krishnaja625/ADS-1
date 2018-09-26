import java.util.Scanner;
import java.util.Arrays;
class Solution{
Solution() {

}
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int size = s.nextInt();
int arr[] = new int[size];
for(int i= 0; i<arr.length; i++) {
  arr[i] = s.nextInt();
}
int cnt =0;
Arrays.sort(arr);
/*if (z == -1) {
  System.out.println("element not present in the array");
} else {*/
  for(int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
      int a = -1 * (arr[i] + arr[j]);
      int z = binarySearch(arr, 0, arr.length-1, a);
/*      System.out.println((arr[i] + arr[j]) + " " +a);
    System.out.println( binarySearch(arr, 0, arr.length-1, a));*/ ;
      if (z > j && a < 0) {
        cnt++;  
    }
    }
/*  System.out.println("element is present" + a);*/
}
System.out.println(cnt);
}
static int binarySearch(int arr[], int startIndex, int endIndex, int x) 
{ 
   if (endIndex >= startIndex) 
   {
        int mid = startIndex + (endIndex - startIndex)/2;
        if (arr[mid] == x)   
            return arr[mid];
        if (arr[mid] > x)  
            return binarySearch(arr, startIndex, mid-1, x);  
        return binarySearch(arr, mid+1, endIndex, x); 
   } 
  return -1; 
}
}