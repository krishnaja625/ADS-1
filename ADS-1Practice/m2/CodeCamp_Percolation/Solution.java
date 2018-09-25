import java.util.Scanner;
class percolation {
	int[][] grid;
	int cnt;
	int size;
	Weightedunion cd;
	percolation(int size) {
		grid = new int[size][size];
		cnt = 0;
		cd = new Weightedunion((size*size) +2);
		size = size;
	}
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
	int component(int i, int j) {
		return (i)*size + j ;
	}
	boolean isOpen(int row, int col) {
		return grid[row-1][col - 1] == 1;
	}
	boolean isFull(int row, int col) {
		return grid[row-1][col - 1] == 0;
	}
	int numberofopensites() {
		return cnt;
	}
	boolean percolates() {
		return cd.connected(0, (size*size) +1);
	}
}
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		percolation wc = new percolation(n);
		while(s.hasNext()){
		wc.open(s.nextInt()-1, s.nextInt()-1);	
		}	
		System.out.println(wc.percolates());
}
}