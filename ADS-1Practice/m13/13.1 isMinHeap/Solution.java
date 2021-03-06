import java.util.Scanner;
/**
 * Class for is minimum heap.
 *
 * @param      <E> generic.
 */
class IsMinHeap<E extends Comparable<E>> {
    /**
     * array of generic type.
     */
    private E[] array;
    /**
     * Constructs the object.
     *
     * @param  a generic type
     */
    IsMinHeap(final E[] a) {
        this.array = a;
    }
    /**
     * Determines if minimum heap.
     * time complexity is N.
     * @return     True if minimum heap, False otherwise.
     */
    public boolean isMinHeap() {
        for (int i = 0; i < array.length - 1; i++) {
            if (less(i + 1, i)) {
                return false;
            }
        }
        return true;
    }
    /**
     * checks whether the element is less.
     *
     * @param      i  integer.
     * @param      j  integer.
     *
     * @return   True if less, False otherwise.
     */
    public boolean less(final int i, final int j) {
        return array[i].compareTo(array[j]) < 0;
    }

}

/**
 * client class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor
    }
    /**
     * client program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
        case "String":
            int n = Integer.parseInt(sc.nextLine());
            while (sc.hasNext()) {
                String[] types = sc.nextLine().split(",");
                IsMinHeap<String> isMinHeapobj
                = new IsMinHeap<String>(types);
                System.out.println(isMinHeapobj.isMinHeap());
            }
            break;
        case "Integer":
            int num1 = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num1; i++) {
                String[] types = sc.nextLine().split(",");
                Integer[] elementInt = new Integer[types.length];
                for (int j = 0; j < types.length; j++) {
                    elementInt[j] = Integer.parseInt(types[j]);
                }
                IsMinHeap<Integer> isMinHeapobj
                = new IsMinHeap<Integer>(elementInt);
                System.out.println(isMinHeapobj.isMinHeap());
            }
            break;
        case "Double":
            int num2 = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num2; i++) {
                String[] types = sc.nextLine().split(",");
                Double[] elementDouble = new Double[types.length];
                for (int j = 0; j < types.length; j++) {
                    elementDouble[j] = Double.parseDouble(types[j]);
                }
                IsMinHeap<Double> isMinHeapobj
                = new IsMinHeap<Double>(elementDouble);
                System.out.println(isMinHeapobj.isMinHeap());
            }
            break;
        case "Float":
            int num3 = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num3; i++) {
                String str = sc.nextLine();
                if (str.equals("")) {
                    System.out.println("false");
                    break;
                } else {
                    String[] types = str.split(",");
                    Float[] elementFloat = new Float[types.length];
                    for (int j = 0; j < types.length; j++) {
                        elementFloat[j] = Float.parseFloat(types[j]);
                    }
                    IsMinHeap<Float> isMinHeapobj
                     = new IsMinHeap<Float>(elementFloat);
                    System.out.println(isMinHeapobj.isMinHeap());
                }
            }
            break;
            default:
            break;
        }
    }
}
