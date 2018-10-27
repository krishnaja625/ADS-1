import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * main method that drives the program.
     * @param      args  The arguments
     * Time complexity for this method is O(N log N)*
     * For some cases the time complexity may be O(M * N) where
     * M is for hash method and N is for while loop.
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, String> lp = new LinearProbingHashST();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(" ");
            /*String value = new String(tokens[0],
            tokens[1], Double.parseDouble(tokens[2]));*/
            String key = tokens[0];
            String value = tokens[1] + "," + tokens[2];
            lp.put(key, value);
            }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String[] token = sc.nextLine().split(" ");
               	String student = lp.get(token[1]);
				String[] std = student.split(",");
            
            if (lp.contains(token[1])) {
            	String st = lp.get(token[0]);
            	if (Integer.parseInt(token[2]) == 1) {
            	    System.out.println(std[0]);
            	} else {
            		System.out.println(std[1]);
            	}
            } else {
            	System.out.println("String doesn't exists...");
            }
            }
	}
}