import java.util.Scanner;
/**
 * Class for deque.
 */
class Deque {
    /**
     * LinkedList class.
     */
    private LinkedList ll;
    /**
     * Constructs the object.
     */
    Deque() {
        ll = new LinkedList();
    }
    /**
     * Determines if empty.
     * @return     True if empty, False otherwise.
     */
    boolean isEmpty() {
        return ll.isEmpty();
    }
    /**
     * returns the size.
     * @return     size.
     */
    int size() {
        return ll.getsize();
    }
    /**
     * Pushes at left.
     * @param      data  The data
     */
    void pushLeft(final int data) {
        ll.insertAtStart(data);
    }
    /**
     * Pushes at right.
     * @param      data  The data
     */
    void pushRight(final int data) {
        ll.insertAtEnd(data);
    }
    /**
     * pops the element to the left.
     */
    void popLeft() {
        ll.deleteAtPos(1);
    }
    /**
     * pops the element to the right.
     */
    void popRight() {
        ll.deleteAtPos(ll.getsize());
    }
    /**
     * displays the queue.
     */
    void display() {
        ll.display();
    }
}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method which drives the program.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque d = new Deque();
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
            case "isEmpty":
                System.out.println(d.isEmpty());
                break;
            case "size":
                System.out.println(d.size());
                break;
            case "pushLeft":
                d.pushLeft(Integer.parseInt(tokens[1]));
                d.display();
                break;
            case "pushRight":
                d.pushRight(Integer.parseInt(tokens[1]));
                d.display();
                break;
            case "popLeft":
                if (d.size() == 0) {
                    System.out.println("Deck is empty");
                } else {
                    d.popLeft();
                    d.display();
                }
                break;
            case "popRight":
                if (d.size() == 0) {
                    System.out.println("Deck is empty");
                } else {
                    d.popRight();
                    d.display();
                }
                break;
            default:
                break;
            }
            n--;
        }
    }
}
