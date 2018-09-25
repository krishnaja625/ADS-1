import java.util.Scanner;
class dynamic_conne {
	int[] arr;
	dynamic_conne() {
		arr = new int[10]; 
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
	}
	void union(int p, int q) {
		int ip = arr[p];
		int iq = arr[q];
		for(int i = 0; i < arr.length; i++) {
		if (arr[i] == arr[ip]) {
			arr[i] = iq;
		}
		}
		
	}
	void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
class dynamic {
	public static void main(String[] args) {
		dynamic_conne dc = new dynamic_conne();
		Scanner s = new Scanner(System.in);
		dc.union(s.nextInt(), s.nextInt());
		dc.print();
	}
}