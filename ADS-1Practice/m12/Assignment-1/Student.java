/**
 * Class for country teams details.
 * This is to 
 */
class Student implements Comparable<Student>{
	String name;
	int date;
	int month;
	int year;
	int subject1;
	int subject2;
	int subject3;
	int total;
	String category;
	int unresVacan;
	int bcVacan;
	int scVacan;
	int stVacan;
	int vacancy;
	Student(String studentName, int date, int month,
		int year, int subject1, int subject2, int subject3,
		int total, String category, int vacancy, int unresVacan, int bcVacan, int scVacan, int stVacan) {
		this.name = studentName;
		this.date = date;
		this.month = month;
		this.year = year;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.total = total;
		this.category = category;
		this.unresVacan = unresVacan;
		this.bcVacan = bcVacan;
		this.scVacan = scVacan;
		this.stVacan = stVacan;
		this.vacancy =vacancy;

	}
	public String getName() {
		return this.name;
	}
	public int getTotal() {
		return this.total;
	}
	public int vacancy() {
		return this.vacancy;
	}
	
	public String getcategory() {
		return this.category;
	}
	public int unresVacan() {
		return this.unresVacan;
	}
	public int bcVacan() {
		return this.bcVacan;
	}
	public int scVacan() {
		return this.scVacan;
	}
	public int stVacan() {
		return this.stVacan;
	}
	public int compareTo(Student st) {
		if (this.total > st.total) {
			return 1;
		}
		if (this.total < st.total) {
			return -1;
		}
		if (this.subject3 > st.subject3) {
			return 1;
		}
		if (this.subject3 < st.subject3) {
			return -1;
		}
		if (this.subject2 > st.subject2) {
			return 1;
		}
		if (this.subject2 < st.subject2) {
			return -1;
		}
		if (this.year > st.year) {
			return 1;
		}
		if (this.year < st.year) {
			return -1;
		}
		if (this.month > st.month) {
			return 1;
		}
		if (this.month < st.month) {
			return -1;
		}
		if (this.date > st.date) {
			return 1;
		}
		if (this.date < st.date) {
			return -1;
		}
		return 0;  
	}
}
