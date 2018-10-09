 import java.util.Scanner;
/**
 * Class for solution.
 */   
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentmerit m = new Studentmerit();
            int noOfapplied = Integer.parseInt(sc.nextLine());
            int vacancies = Integer.parseInt(sc.nextLine());
            int unres = Integer.parseInt(sc.nextLine());
            int noOfBC = Integer.parseInt(sc.nextLine());
            int noOfSC = Integer.parseInt(sc.nextLine());
            int noOfST = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < noOfapplied; i++) {
                String data = sc.nextLine();
                String[] tokens = data.split(",");
                m.addStudent(new Student(tokens[0],
                 tokens[1], tokens[2], tokens[3],
                  tokens[4], tokens[5], tokens[6]));
            }
        m.InsertionSort();
        System.out.println(m);
        m.sort(vacancies, unres, noOfBC, noOfSC, noOfST);
        for (int i = 0; i < vacancies; i++) {
            System.out.println(m.getnewStudents(i).toString());       
        }
    }  
}