import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1 = Integer.parseInt(input.nextLine());
        int size2 = Integer.parseInt(input.nextLine());
        String[] arr1 = input.nextLine().split(",");
        String[] arr2 = input.nextLine().split(",");
        int[] array1;
        int[] array2;
        array2 = new int[arr2.length];

/*        if(t[0].equals("")) {
            array1 = new int[0];
        }
        else {*/
            array1 = new int[size1];
            for(int i = 0; i<size1; i++) {
            array1[i] = Integer.parseInt(arr1[i]);
       /* }*/
        }
        for(int i = 0; i<arr2.length; i++) {
            array2[i] = Integer.parseInt(arr2[i]);
        }


        // System.out.println(Arrays.toString(array1));
        // System.out.println(Arrays.toString(array2));
        sortedArray(array1, array2);

    }

    public static void sortedArray(int[] array1, int[] array2) {
        int i = 0;
        int j = 0;
        int [] result;
        result = new int[array1.length + array2.length];
        for(int a = 0; a < result.length; a++) {
            if (i < array1.length && j < array2.length) {
                if(array1[i] < array2[j]) {
                    result[a] = array1[i++];
                }
                else
                    result[a] = array2[j++];
            }
            else if(i>=array1.length) {
                result[a] = array2[j++];
            }
            else if(j>=array2.length) {
                result[a] = array1[i++];
            }
        }
        System.out.println(Arrays.toString(result).replace("[", "").replace("]","").replace(" ",""));
    }
}