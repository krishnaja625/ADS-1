import java.util.Scanner;
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
        sc.nextLine();
        while (sc.hasNext()) {
        String[] details = sc.nextLine().split(",");
        String[] dates = details[1].split("-");
        Student st = new Student(details[0], Integer.parseInt(dates[0]), Integer.parseInt(dates[1]),
            Integer.parseInt(dates[2]), Integer.parseInt(details[2]),
            Integer.parseInt(details[3]), Integer.parseInt(details[4]),
         Integer.parseInt(details[5]), details[6]);
        sd.addStudent(st);
    }
    sd.selectionSort();
    sd.print();

    }
}