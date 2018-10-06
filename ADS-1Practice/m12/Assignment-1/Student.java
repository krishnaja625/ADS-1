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
     /*   Ajay,12-06-1993,32,33,11,76,Open

        Student Name, Date of birth, subject1 marks, subject2 marks, subject3 marks, Total marks, Reservation category
All the student information seperated with commas respectively
*/
	Student(String studentName, int date, int month,
		int year, int subject1, int subject2, int subject3, int total, String category) {
		this.name = studentName;
		this.date = date;
		this.month = month;
		this.year = year;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.total = total;
		this.category = category;

	}
	public String getName() {
		return this.name;
	}
	public int getTotal() {
		return this.total;
	}
	public String getcategory() {
		return this.category;
	}
	public int compareTo(Student st) {
		if (this.total < st.total) {
			return 1;
		}
		if (this.total > st.total) {
			return -1;
		}
		if (this.subject1 > st.subject1) {
			return 1;
		}
		if (this.subject1 < st.subject1) {
			return -1;
		}
		return 0;  
	}
}
