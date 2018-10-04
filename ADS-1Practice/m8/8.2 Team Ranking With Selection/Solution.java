/**
 * TO import Scanner.
 */
import java.util.Scanner;
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
     * Function for main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        teamObjects to = new teamObjects();
        final int t = 3;
        while (sc.hasNext()) {
        String line = sc.nextLine();
        String[] tokens = line.split(",");
        CountryTeams cn = new CountryTeams(
            tokens[0], Integer.parseInt(tokens[1]),
            Integer.parseInt(tokens[2]),
             Integer.parseInt(tokens[t]));
                    to.addCountryTeams(cn);
        }
        to.InsertionSort();
        System.out.println(to.getNames());
    }
}
