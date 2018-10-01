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
     * main method to drive the program.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tc; i++) {
            Steque st = new Steque();
            while (sc.hasNext()) {
                String tmp = sc.nextLine();
                if (tmp.length() == 0) {
                    break;
                }
                String[] token = tmp.split(" ");
                switch (token[0]) {
                case "push":
                    st.push(Integer.parseInt(token[1]));
                    break;
                case "enqueue":
                    st.enqueue(Integer.parseInt(token[1]));
                    break;
                case "pop":
                    st.pop();
                    break;
                default:
                    break;
                }
            }
            System.out.println();
        }
    }
}
