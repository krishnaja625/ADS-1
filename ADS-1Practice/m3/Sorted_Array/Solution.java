/**
 * To import Scanner.
 */
import java.util.Scanner;
/**
 * To import Arrays class.
 */
import java.util.Arrays;
/**
 * Class for solution.
 */
class Solution {
/**
 * Constructs the object.
 */
    protected Solution() {

    }
    /**
     * function for main.
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = Integer.parseInt(input.nextLine());
        int size2 = Integer.parseInt(input.nextLine());
        String[] arr1 = input.nextLine().split(",");
        String[] arr2 = input.nextLine().split(",");
        int[] array1;
        int[] array2;
        array2 = new int[arr2.length];
            array1 = new int[size1];
            for(int i = 0; i<size1; i++) {
            array1[i] = Integer.parseInt(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            array2[i] = Integer.parseInt(arr2[i]);
        }
        sortedArray(array1, array2);
    }
/**
 * function for sorting the given arrays.
 *
 * @param      array1  The array 1
 * @param      array2  The array 2
 */

    public static void sortedArray(final int[] array1, final int[] array2) {
        int i = 0;
        int j = 0;
        int [] result;
        result = new int[array1.length + array2.length];
        for (int a = 0; a < result.length; a++) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    result[a] = array1[i++];
                } else {
                    result[a] = array2[j++];
                }
            } else if (i >= array1.length) {
                result[a] = array2[j++];
            } else if (j >= array2.length) {
                result[a] = array1[i++];
            }
        }
        System.out.println(Arrays.toString(
            result).replace("[", "").replace("]", "").replace(" ", ""));
    }
}