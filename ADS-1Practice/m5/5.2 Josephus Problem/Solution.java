/**
 * To import scanner.
 */
import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main takes input from user and prints output to console.
     *
     * @param      args  The commandline arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputcount = sc.nextInt();
        for (int inp = 0; inp < inputcount; inp++) {
            int numOfpeople = sc.nextInt();
            int m = sc.nextInt();
            CircularLinkedList cl = new CircularLinkedList();
            for (int i = 0; i < numOfpeople; i++) {
                cl.add(i);
            }
            String str = "";
            while (!cl.isEmpty()) {
                int t2 = 0;
                for (int i = 0; i < m; i++) {
                    t2 = cl.getNext();
                }
                str += cl.remove(t2) + " ";
            }
            System.out.println(str.trim());
        }
    }
}