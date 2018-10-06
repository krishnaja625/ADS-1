/**
 * Class for team objects.
 */
class Studentdetails {
	/**
	 * stuArray is private.
	 */
	private Student[] stuArray;
	/**
	 * size is private variable.
	 */
	private int size;
	/**
	 * Constructs the object.
	 */
	Studentdetails() {
		stuArray = new Student[30];
		size = 0;
	}
	/**
	 * Adds country stuArray.
	 * As there is a single line operation the time complexity is constant.
	 Time complexity = O(1)
	 *
	 * @param      t     { parameter_description }
	 */
	public void addStudent(final Student t) {
		stuArray[size++] = t;
	}
	/**
	 * For the for loop it iterates till the size of the array.
	 * In worst case condition if size is N. Time complexity is O(N).
	 *
	 *
	 * @return     The names.
	 */
	public void print() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str = "";
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + "," + stuArray[i].getcategory();
			System.out.println(str);
		}
	}
		public void finalprint() {
		String str = "";
		int unresVacan = stuArray[0].unresVacan();
		int bcVacan = stuArray[0].bcVacan();
		int scVacan = stuArray[0].scVacan();
		int stVacan = stuArray[0].stVacan();
		int vacancy = stuArray[0].vacancy();
		/*int x = unresVacan + bcVacan + scVacan + stVacan;*/
	/*	for (int m = 0; m < unresVacan; m++) {
			for(int i =0; i <size; i++) {
			str = "";
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + ", " + stuArray[i].getcategory();
			System.out.println(str);
		}
		}
		for (int j = 0; j < bcVacan; j++) {
			for(int i =0; i <size; i++) {
			str = "";
			if(stuArray[i].getcategory().equals("BC")) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + ", " + stuArray[i].getcategory();
			System.out.println(str);
			}
		}
		}
		for (int k = 0; k < scVacan; k++) {
			for(int i =0; i <size; i++) {
			str = "";
			if(stuArray[i].getcategory().equals("SC")) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + ", " + stuArray[i].getcategory();
			System.out.println(str);
			}
		}
		}*/
		int ur =0;
		int bc =0;
		int st = 0;
		int sc =0;
		int va = 0;
		int oc = 0;
		if (va<vacancy) {
			for(int i =0; i <size; i++) {
			str = "";
			if(ur < unresVacan) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + "," + stuArray[i].getcategory();
			System.out.println(str);
			if(stuArray[i].getcategory().equals("BC"))
				bc = 1;
			if(stuArray[i].getcategory().equals("Open"))
				oc = 1;
			if(stuArray[i].getcategory().equals("SC"))
				sc = 1;
			if(stuArray[i].getcategory().equals("ST"))
				st = 1;
			ur++;
			va++;
		}
		else if (stuArray[i].getcategory().equals("BC")&& bc < bcVacan) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + "," + stuArray[i].getcategory();
			System.out.println(str);
			bc++;
			va++;
			}
		else if (stuArray[i].getcategory().equals("SC") && sc < scVacan) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + "," + stuArray[i].getcategory();
			System.out.println(str);
			sc++;
			va++;
			}
		else if (stuArray[i].getcategory().equals("SC")&& st < stVacan) {
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + "," + stuArray[i].getcategory();
			System.out.println(str);
			st++;
			va++;
			}
	}
	}
}
/**
 * As there is a single line operation the time complexity is constant.
 * Time complexity = O(1)
 * @param      team  The team
 * @param      i     { parameter_description }
 * @param      j     { parameter_description }
 */
	public void swaps(final Student[] team, final int i, final int j) {
		Student ct = stuArray[j];
		stuArray[j] = stuArray[i];
		stuArray[i] = ct;
	}
	/**
	 * the first for loop iterates for N times,
	 * the second for loop is independent of 1st for
	 * loop and iterates for N-1 times calls the less
	 * method whose time complexity is 1.
	 * the swap method also takes constant time.
	 * hence in total iterations are N*(N-1) which is equals to N^2.
	 * thus the time complexity is N^2
	 */
	public void selectionSort() {
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (lessThan(stuArray, j, min)) {
					min = j;
				}
			}
			swaps(stuArray, i, min);
        }
	}
	/**
	 * Time complexity is constant.
	 * Time complexity = O(1)
	 * @param      arr   The arr
	 * @param      i     { parameter_description }
	 * @param      j     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	boolean lessThan(final Student[] arr, final int i, final int j) {
		return  arr[i].compareTo(arr[j]) > 0;
	}
}