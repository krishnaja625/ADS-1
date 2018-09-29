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

        int m = 0;
        if (list1.size() > list2.size()) {
            m = list1.size() - list2.size();
        for (int i = 0; i < m; i++) {
            list2.insertFirst("0");
        }
        } else {
            m = list2.size() - list1.size();
        for (int i = 0; i < m; i++) {
            list1.insertFirst("0");
        }
        }
        Node elemnt1 = list1.first;
        Node elemnt2 = list2.first;
        Node elemnt3 = finalList.first;
        // System.out.println(digitsToNumber(list1)+"  ---"+list1.size());
        // System.out.println(digitsToNumber(list2)+"  ---"+list2.size());
            
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s3 = new Stack();
        Stack res = new Stack();
            for(int i = 0; i < list1.size(); i++) {
                s1.push(elemnt1.data);
                elemnt1 = elemnt1.next;
            }
            for(int i = 0; i < list2.size(); i++) {
                s2.push(elemnt2.data);
                elemnt2 = elemnt2.next;
            }
            String num = "";
            
        int sum = 0, carry = 0, value1, value2,v4=0;
         while ((!s1.isEmpty()) && (!s2.isEmpty()))
         {
            if(!s3.isEmpty())
            {
                v4 = Integer.parseInt(s3.pop());
            }
             value1 = Integer.parseInt(s1.pop());
             value2 = Integer.parseInt(s2.pop());
             
             sum   = (value1 + value2 + v4) % 10;
             carry = (value1 + value2 + v4) / 10;
             res.push(sum+"");
            if (carry > 0)
         {
            String sc = carry + "";
             s3.push(sc);
         }
       
         } 
  
         
         while (!res.isEmpty()) {
            finalList.insert(res.pop());
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
