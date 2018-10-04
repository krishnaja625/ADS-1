/**
 * Class for team objects.
 */
class teamObjects {
	/**
	 * teamArray is private.
	 */
	private CountryTeams[] teamArray;
	/**
	 * size is private variable.
	 */
	private int size;
	/**
	 * Constructs the object.
	 */
	teamObjects() {
		teamArray = new CountryTeams[10];
		size = 0;
	}
	/**
	 * Adds country teamArray.
	 * As there is a single line operation the time complexity is constant.
	 Time complexity = O(1)
	 *
	 * @param      t     { parameter_description }
	 */
	public void addCountryTeams(final CountryTeams t) {
		teamArray[size++] = t;
	}
	/**
	 * For the for loop it iterates till the size of the array.
	 * In worst case condition if size is N. Time complexity is O(N).
	 *
	 *
	 * @return     The names.
	 */
	public String getNames() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str += teamArray[i].getName() + ",";
		}
		return str.substring(0, str.length() - 1);
	}
/**
 * As there is a single line operation the time complexity is constant.
 * Time complexity = O(1)
 * @param      team  The team
 * @param      i     { parameter_description }
 * @param      j     { parameter_description }
 */
	public void swaps(final CountryTeams[] team, final int i, final int j) {
		CountryTeams ct = teamArray[j];
		teamArray[j] = teamArray[i];
		teamArray[i] = ct;
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
				if (less(teamArray, j - 1, j)) {
					swaps(teamArray, j -1, j);
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
	public boolean less(CountryTeams[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) < 0;
	}
}
