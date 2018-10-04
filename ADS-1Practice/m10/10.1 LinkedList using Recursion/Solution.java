import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method which drives the program.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList llist = new LinkedList();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
            case "insertAt":
                llist.insertAt(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                llist.display();
                break;
            case "reverse":
                llist.reverse();
                llist.display();
                break;
            }
        }
    }
}
