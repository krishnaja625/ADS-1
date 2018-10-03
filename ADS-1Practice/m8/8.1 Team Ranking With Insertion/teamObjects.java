class teamObjects {
	private CountryTeams[] teamArray;
	private int size;
	teamObjects() {
		teamArray = new CountryTeams[10];
		size = 0;
	}
	public void addCountryTeams(CountryTeams t) {
		teamArray[size++] = t;
	}
	public String getNames() {
		String str = "";
		for (int i = 0; i < size; i++) {
			str += teamArray[i].getName() + ",";
		}
		return str.substring(0, str.length() - 1);
	}
	public void swaps(CountryTeams[] team, int i, int j) {
		CountryTeams ct = teamArray[j];
		teamArray[j] = teamArray[i];
		teamArray[i] = ct; 
	}
	public void selectionSort() {
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (lessThan(teamArray, j, min)) {
					min = j;
				} 
			}
			swaps(teamArray, i, min);
        }
	}
	boolean lessThan(CountryTeams[] arr, int i, int j) {
		return  arr[i].compareTo(arr[j]) > 0;
	}
}