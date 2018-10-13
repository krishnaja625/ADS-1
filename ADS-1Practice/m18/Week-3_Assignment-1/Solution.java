import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < 6; j++){
            MinPQ<Stocks> minpq = new MinPQ<Stocks>();
            MaxPQ<Stocks> maxpq = new MaxPQ<Stocks>();
            for(int i = 0; i <n ; i++) {
                String[] tokens = sc.nextLine().split(",");
                Stocks st = new Stocks(tokens[0], Double.parseDouble(tokens[1]));
                minpq.insert(st);
                maxpq.insert(st);
            }
            String[] strmin = new String[5];
            for(int z = 0; z < 5; z++) {
             System.out.println(minpq.delMin().getName());
               /* strmin[z] = minpq.delMin();*/
            }
            // System.out.println(Arrays.toString(strmin));
            String[] strmax = new String[5];
            for(int z = 0; z < 5; z++) {
                // strmax[z] = maxpq.delMax();
                System.out.println(maxpq.delMax().getName());
            }
        }
    }
}
