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
        sc.nextLine();
        for (int j = 0; j < 6; j++){
            MinPQ<Stocks> minpq = new MinPQ<Stocks>();
            MaxPQ<Stocks> maxpq = new MaxPQ<Stocks>();
            for(int i = 0; i <n ; i++) {
                String[] tokens = sc.nextLine().split(",");
                Stocks st = new Stocks(tokens[0], Double.parseDouble(tokens[1]));
                minpq.insert(st);
                maxpq.insert(st);
            }
            Stocks[] strmin = new Stocks[5];
            for(int z = 0; z < 5; z++) {
             strmin[z] = minpq.delMin();
             System.out.println(strmin[z]);
            // Symboltable stable = new Symboltable()
            }
            System.out.println();
            Stocks[] strmax = new Stocks[5];
            for(int z = 0; z < 5; z++) {
                strmax[z] = maxpq.delMax();
                System.out.println(maxpq.delMax());
            }
            System.out.println();
        }
    }
}