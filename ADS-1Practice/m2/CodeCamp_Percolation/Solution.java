import java.util.Scanner;
class per {
	int[][] grid;
	int cnt;
	int size;
	Weightedunion cd;
	per(int size) {
		grid = new int[size][size];
		cnt = 0;
		cd = new Weightedunion((size*size) +2);
		size = size;
	}
	void open(int row, int col) {
		grid[row-1][col - 1] = 1;
		cnt++;
		if(row==0) {
			cd.union(0, component(row-1, col-1));
		}
		if (row == size -1) {
			cd.union((size*size) +1 , component(row-1, col-1));
		}
		if (row>0 ) {
			if(grid[row][col] == 1) {
				cd.union(component(row - 1, col) , component(row, col));
			}
		}
		if (row <= size - 1) {
			if(grid[row-2][col] == 1) {
				cd.union(component(row - 1, col-1) , component(row-2, col-1));
			}
		}
		if (col>0) {
			if(grid[row-1][col+2] == 1) {
				cd.union(component(row - 1, col-1) , component(row-1, col));
			}
		}	
		if (row <= size - 1) {
			if(grid[row+1][col-2] == 1) {
				cd.union(component(row - 1, col-1) , component(row-1, col-2));
			}
		}
	}
	int component(int i, int j) {
		return (i-1)*size + j;
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
		per wc = new per(n);
		while(s.hasNext()){
		wc.open(s.nextInt(), s.nextInt());	
		}	
		System.out.println(wc.percolates());
}
}