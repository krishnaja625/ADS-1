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
        Deque dq = new Deque();
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
            case "isEmpty":
                System.out.println(dq.isEmpty());
                break;
            case "size":
                System.out.println(dq.size());
                break;
            case "pushLeft":
                dq.pushLeft(Integer.parseInt(tokens[1]));
                dq.display();
                break;
            case "pushRight":
                dq.pushRight(Integer.parseInt(tokens[1]));
                dq.display();
                break;
            case "popLeft":
                if (dq.size() == 0) {
                    System.out.println("Deck is empty");
                } else {
                    dq.popLeft();
                    dq.display();
                }
                break;
            case "popRight":
                if (dq.size() == 0) {
                    System.out.println("Deck is empty");
                } else {
                    dq.popRight();
                    dq.display();
                }
                break;
            default:
                break;
            }
            n--;
        }
    }
}
