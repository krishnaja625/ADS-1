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
		stuArray = new Student[10];
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
			str = stuArray[i].getName() + "," + stuArray[i].getTotal() + ", " + stuArray[i].getcategory();
			System.out.println(str);
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
	public void insertionSort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (less(stuArray, j - 1, j)) {
					swaps(stuArray, j -1, j);
				} 
			}
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
	public boolean less(Student[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) < 0;
	}
}
