/**
 * { item_description }
 */
import java.util.Scanner;
/**
 * Class for node.
 */
class Node {
    String data;
    Node next;
    /**
     * Constructs the object.
     */
    Node() {
    }
    /**
     * Constructs the object.
     *
     * @param      data  The data
     */
    Node(final String data) {
        this.data = data;
    }
}
/**
 * List of linkeds.
 */
class LinkedList {
    Node first;
    Node last;
    private int size;
    /**
     * Constructs the object.
     */
    LinkedList() {
        first = new Node();
        last = new Node();
        size = 0;
    }
    /**
     * { function_description }.
     *
     * @param      item  The item
     */
    void insert(final String item) {
        Node obj = new Node(item);
        if (size == 0) {
            first = obj;
            last = obj;
            size++;
            return;
        }
        last.next = obj;
        // last = obj;
        last = last.next;

        size++;
    }
    /**
     * { function_description }.
     *
     * @param      data  The data
     */
    public void insertFirst(final String data) {
        Node head = new Node(data);
        if (size == 0) {
            first = head;
            size++;
            return;
        }
        head.next = first;
        first = head;
        size++;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    String delete() {
        String data = first.data;
        first = first.next;
        size--;
        return data;
    }
    void print() {
        if (size == 0) {
            System.out.println("Steque is empty.");
        }
        Node tmp = first;
        while (tmp.next != null) {
            System.out.println(tmp.data + ", ");
            tmp = tmp.next;
        }

    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    int size() {
        return size;
    }
}
/**
 * Class for stack.
 */
class Stack {
    /**
     * { var_description }.
     */
    LinkedList llist;
    /**
     * Constructs the object.
     */
    Stack() {
        llist = new LinkedList();
    }
    /**
     * { function_description }.
     *
     * @param      item  The item
     */
    void push(final String item) {
        llist.insertFirst(item);
    }
    void enqueue(final String item) {
        llist.insert(item);
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    String pop() {
        if (llist.size() == 0) {
            System.out.println("Steque is empty.");
        }
        llist.print();
        return llist.delete();
    }
    /**
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     */
    boolean isEmpty() {
        return llist.isEmpty();
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    int size() {
        return llist.size();
    }
}
class Solution {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        int n = sc.nextInt();
        sc.nextLine();
        while (sc.hasNext()) {
         String str = sc.nextLine();
         if (str.length() == 0) {
            System.out.println();
         }
         String[] tokens = str.split(" ");
        switch (tokens[0]) {
            case "push":
            st.push(tokens[1]);
            break;
            case "enqueue":
            st.enqueue(tokens[1]);
            break;
            case "pop":
            if(!st.isEmpty()) {
                System.out.println(st.pop());
            }
            break;


        }

    }   
}
}