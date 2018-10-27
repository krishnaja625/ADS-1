/**
 * Class for book.
 */
class Student implements Comparable<Student> {
    Student() {
        
    }
    /**
     * name of the book.
     */
    private String name;
    /**
     * rollnumber of the book.
     */
    private String rollnumber;
    /**
     * totalmarks of the book.
     */
    private double totalmarks;
    /**
     * Constructs the object.
     * @param      n     name.
     * @param      a     rollnumber.
     * @param      p     totalmarks.
     */
    Student(final String a, final String n,
        final double p) {
        name = n;
        rollnumber = a;
        totalmarks = p;
    }
    /**
     * Gets the name.
     * @return     The name.
     */
    String getName() {
        return name;
    }
    /**
     * Gets the rollnumber.
     * @return     The rollnumber.
     */
    String getrollnumber() {
        return rollnumber;
    }
    /**
     * Gets the totalmarks.
     * @return     The totalmarks.
     */
    double gettotalmarks() {
        return totalmarks;
    }
    /**
     * compareTo method.
     * @param      b     b of type Student.
     * @return     integer.
     */
    public int compareTo(final Student b) {
        return getName().compareTo(b.getName());
    }
}
