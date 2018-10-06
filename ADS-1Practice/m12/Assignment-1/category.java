class Category implements Comparable<Category>{
    int vacancy;
    int unresVacan;
    int bcVacan;
    int scVacan;
    int stVacan;
	Category(int vacancy, int unresVacan, int bcVacan, int scVacan, int stVacan, ) {
		this.vacancy = vacancy;
		this.unresVacan = unresVacan;
		this.bcVacan = bcVacan;
		this.scVacan = scVacan;
		this.stVacan = stVacan;
	}
	void finalprint() {
		for (int i = 0; i < )

	}

}

/*All applicants are eligible for un reserved category seats
Un reserved category seats should be filled with descending merit order
reserved seats should be filled with reserved students in descending merit order
if any of the reserved seats are left with out reserved candidates then fill the seats with descending merit order*/