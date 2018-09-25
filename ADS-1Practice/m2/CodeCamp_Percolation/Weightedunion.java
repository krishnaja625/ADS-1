import java.util.Scanner;
class Weightedunion {
	int[] arr;
	int[] sizeArr;
	Weightedunion(int size) {
		arr = new int[size]; 
		for(int i = 0; i < size; i++) {
			arr[i] = i;
		}
		sizeArr = new int[size]; 
		for(int i = 0; i < size; i++) {
			sizeArr[i] = 1;
		}
	}
	boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	int root(int z) {
		while (z != arr[z]) {
			z = arr[z];
		}
		return z;
	}
	void union(int p, int q) {
		int ip = root(p);
		int iq = root(q);
		if (ip == iq) {
			return;
		}
		if (sizeArr[ip] < sizeArr[iq]) {
			arr[ip] = iq;
			sizeArr[iq] += sizeArr[ip];
		} else {
			arr[iq] = ip;
			sizeArr[ip] += sizeArr[iq];
		}
		}		
}
/*class CodeCamp_Percolation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Weightedunion wc = new Weightedunion(n);
		while(s.hasNext()){
		wc.union(s.nextInt(), s.nextInt());	
		}	
		wc.print();
}
}*/
	
