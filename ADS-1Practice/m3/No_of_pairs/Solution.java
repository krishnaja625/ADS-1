/**
 * To import scanner.
 */
import java.util.Scanner;
/**
 * To import array class.
 */
import java.util.Arrays;
/**
 * Class for solution.
 */
class Solution{
	/**
	 * Constructs the object.
	 */
	protected Solution() {
	}
	/**
	 * function of main.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int arr[] = new int[10];
	for(int i= 0; i<arr.length; i++) {
		arr[i] = s.nextInt();
	}
	Arrays.sort(arr);
	int count = 0;
	int sum = 0;
		for (int i = 0 ; i < arr.length - 1; i++) {
			if(i == arr.length - 2 &&  arr[i] == arr[i + 1]){
				count++;
				sum += count * (count - 1) / 2;
				break;
			}
			if(arr[i] == arr[i + 1]){
				count++;
				continue;
			}
			if(count > 1 && arr[i] != arr[i + 1]){
				sum += count * (count - 1) / 2;
				count = 1;
			}
		}
	 System.out.println(sum);
	}
	}