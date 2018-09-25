/* To import scanner class*/
import java.util.Scanner;
/**
 * Class for percolation.
 */
class percolation {
/**
 * variable to keep count value.
 */
	private int cnt;
	/**
	 * to take 2 dimentional array.
	 */
	private int[][] grid;
	/**
	 * { to keep size }.
	 */
	private int size;
	/**
	 * object for weighted union class.
	 */
	Weightedunion cd;
/**
 * Constructs the object.
 *
 * @param      size  The size
 */
	percolation(int size) {
		grid = new int[size][size];
		cnt = 0;
		cd = new Weightedunion((size*size) +2);
		size = size;
	}
	/**
	 * function to check whether the element has to be connected or not.
	 *
	 * @param      row   The value of row
	 * @param      col   The value of column
	 */
	void open(int row, int col) {
		grid[row][col] = 1;
		cnt++;
		if(row==0) {
			cd.union(0, component(row, col));
		}
		if (row == size -1) {
			cd.union((size*size) +1 , component(row, col));
		}
		if(row+1 <size && grid[row][col] == 1) {
				cd.union(component(row + 1, col) , component(row, col));
			}
		if (row-1 >0 && grid[row-1][col] == 1) {
				cd.union(component(row - 1, col) , component(row, col));
		}
		if (col-1 >0 && grid[row][col-1] == 1) {
				cd.union(component(row, col-1) , component(row, col));
		}	
		if (col+1 <size && grid[row][col+1] == 1) {
				cd.union(component(row, col+1) , component(row, col));
		}
	}
	/**
	 * to get the component at the particular row and column.
	 *
	 * @param      i     row index is given.
	 * @param      j     column index is given
	 *
	 * @return     return type is int
	 */
	int component(int i, int j) {
		return (i)*size + j ;
	}
	/**
	 * Determines if open.
	 *
	 * @param      row   The row
	 * @param      col   The col
	 *
	 * @return     True if open, False otherwise.
	 */
	boolean isOpen(int row, int col) {
		return grid[row][col] == 1;
	}
	/**
	 * Determines if full.
	 *
	 * @param      row   The row
	 * @param      col   The col
	 *
	 * @return     True if full, False otherwise.
	 */
	boolean isFull(int row, int col) {
		return grid[row][col] == 0;
	}
	/**
	 * to get the number of open sites.
	 *
	 * @return     integer is returned.
	 */
	int numberofopensites() {
		return cnt;
	}
	/**
	 * function to check if the grid percolates or not.
	 *
	 * @return     True if percolates, False otherwise.
	 */
	boolean percolates() {
		return cd.connected(0, (size*size) +1);
	}
}
/**
 * Class for solution.
 */
class Solution {
	/**
	 * function of main
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		percolation wc = new percolation(n);
		while(s.hasNext()){
		wc.open(s.nextInt() - 1, s.nextInt() - 1);	
		}	
		System.out.println(wc.percolates());
}
}