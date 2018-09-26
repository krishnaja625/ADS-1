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
  for(int i = 0; i < arr.length && arr[i] <=0; i++) {
    for (int j = i+1; j < arr.length && arr[i] + arr[j] <=0; j++) {
      int a = -1 * (arr[i] + arr[j]);
      int z = binarySearch(arr, j+1, arr.length-1, a);
      if (z > j) {
        cnt++;  
    }
    }
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