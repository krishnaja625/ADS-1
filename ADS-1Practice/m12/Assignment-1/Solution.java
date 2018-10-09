/**
 * to import Scanner
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentdetails sd = new Studentdetails();
        int inputs = sc.nextInt();
        int vacancy = sc.nextInt();
        int unresVacan = sc.nextInt();
        int bcVacan = sc.nextInt();
        int scVacan = sc.nextInt();
        int stVacan = sc.nextInt();
        final int thr = 3;
        final int fo = 4;
        final int fi = 5;
        final int six = 6;
        sc.nextLine();
        while (sc.hasNext()) {
            String[] details = sc.nextLine().split(",");
            String[] dates = details[1].split("-");
            Student st = new Student(details[0], Integer.parseInt(dates[0]),
             Integer.parseInt(dates[1]),
                Integer.parseInt(dates[2]), Integer.parseInt(details[2]),
                Integer.parseInt(details[thr]), Integer.parseInt(details[fo]),
             Integer.parseInt(details[fi]), details[six], vacancy,
             unresVacan, bcVacan, scVacan, stVacan);
            sd.addStudent(st);
        }
        sd.selectionSort();
        sd.print();
        System.out.println();
        sd.finalprint();
        }
}