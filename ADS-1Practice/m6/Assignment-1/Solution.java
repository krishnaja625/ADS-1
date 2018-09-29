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
        last = obj;
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
        String data = last.data;
        last = last.next;
        size--;
        return data;
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
        llist.insert(item);
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    String pop() {
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
/**
 * Class for add large numbers.
 */
class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    protected AddLargeNumbers() {

    }
    /**
     * function for numberToDigits.
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList object = new LinkedList();
            for (int i = 0; i < number.length(); i++) {
                String s = number.charAt(i) + "";
                object.insert(s);
            }
            return object;
    }
    /**
     * { functionfor digitsToNumber }.
     *
     * @param      list  The list
     *
     * @return     returns string
     */
    public static String digitsToNumber(final LinkedList list) {
        Node nextElemnt = list.first;
        String string = new String();
            for (int i = 0; i < list.size(); i++) {
                string += nextElemnt.data + "";
                nextElemnt = nextElemnt.next;
            }
            return string;
    }
/**
 * Adds large numbers.
 *
 * @param      list1  The list 1
 * @param      list2  The list 2
 *
 * @return     return tyope is linkedlist
 */
    public static LinkedList addLargeNumbers(final
        LinkedList list1, final LinkedList list2) {
        LinkedList finalList = new LinkedList();
        LinkedList slist = new LinkedList();
        Node elemnt1 = list1.last;
        Node elemnt2 = list2.last;
        Node elemnt3 = finalList.first;
        int m = 0;
        if (list1.size() > list2.size()) {
            slist = list2;
            m = list1.size() - list2.size();
        } else {
            slist = list1;
            m = list2.size() - list1.size();
        }
        for (int i = 0; i < m; i++) {
            list2.insertFirst("0");
        }
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        int sum = 0;
        String str1 = digitsToNumber(list1);
        String str2 = digitsToNumber(list2);
        int n = str2.length();
            for (int i = 0; i < n; i++) {
                elemnt1 = list1.last;
                elemnt2 = list2.last;
                if (!s1.isEmpty()) {
                    sum = Integer.parseInt(elemnt1.data)
                    + Integer.parseInt(elemnt2.data)
                    + Integer.parseInt(s1.pop());
                    System.out.println(sum);
                    list1.delete();
                    list2.delete();
                } else {
                sum = Integer.parseInt(elemnt1.data)
                + Integer.parseInt(elemnt2.data);
                System.out.println(sum);
                list1.delete();
                list2.delete();
                }
                String el3 = sum + "";
                if (el3.length() == 1) {
                    s2.push(el3);
                } else {
                    String[] a = el3.split("");
                    s1.push(a[0]);
                    s2.push(a[1]);
                }
                while (!s2.isEmpty()) {
                    finalList.insert(s2.pop());
                }
        /*
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();
        Stack s4 = new Stack();
            for(int i = 0; i < list1.size; i++) {
                s1.push(elemnt1.data);
                elemnt1 = elemnt1.next;
            }
            System.out.println(list1.size);
            for(int i = 0; i < list1.size; i++) {
                s2.push(elemnt2.data);
                elemnt2 = elemnt2.next;
            }
            System.out.println(s2.pop());
            System.out.println(s2.pop());
            int sum = 0;
            String num = "";
            int n1 = list1.size;
            int n2 = list2.size;
            for(int i = 0; i < n1; i++) {
                if (!s4.isEmpty()) {
                    sum = Integer.parseInt(s1.pop())
                    + Integer.parseInt(s2.pop())
                    + Integer.parseInt(s4.pop());
                }
                else {
                sum = Integer.parseInt(s1.pop())
                + Integer.parseInt(s2.pop());
                }
                num = sum + "";
                if (num.length() == 1) {
                    s3.push(num);
                    elemnt3.data = num;
                    elemnt3 = elemnt3.next;
                } else {
                    String[] a = num.split("");
                    s4.push(a[0]);
                    s3.push(a[1]);
                    elemnt3.data = num;
                    elemnt3 = elemnt3.next;
                }
            }
            return finalList;
    }

*/
    }
    return finalList;
}
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * Function for main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.
                addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
            default:
        }
    }
}
