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
		LinearProbingHashST<String, Student> lp = new LinearProbingHashST();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(" ");
            Student key = new Student(tokens[0],
            tokens[1], Double.parseDouble(tokens[2]));
            String value = tokens[0];
            lp.put(value, key);
            }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String[] token = sc.nextLine().split(" ");
            
            if (lp.contains(token[0])) {
            	Student st = lp.get(token[0]);
            	if (Integer.parseInt(token[2]) == 1) {
            	    System.out.println(st.getName());
            	} else {
            		System.out.println(st.gettotalmarks());
            	}
            } else {
            	System.out.println("Student doesn't exists...");
            }
            }
         
	}
}