import java.util.Scanner;
class Node{
	String data;
	Node next;
	Node(){

	}
	Node(String data){
		this.data = data;
	}
}
class LinkedList{
	Node first;
	Node last;
	int size;
	LinkedList(){
		first = new Node();
		last = new Node();
		size = 0;
	}
	void insert(String item){
		Node obj = new Node(item);
		if(size==0){
			first = obj;
			last = obj;
			size++;
			return;
		}
		last.next = obj;
		last = obj;
		size++;
	}
    public void insertFirst(String data) {
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



	String delete(){
		String data = last.data;
		last = last.next;
		size--;
		return data;
	}

	boolean isEmpty(){
		if(size ==0){
			return true;
		}
		return false;
	}

	int size(){
		return size;
	}
}

class Stack{
	LinkedList llist ;
	Stack (){
		llist = new LinkedList();
	}

	void push(String item){
		llist.insert(item);
	}
	String pop(){
		return llist.delete();
	}
	boolean isEmpty(){
		return llist.isEmpty();
	}
	int size(){
		return llist.size();
	}
}
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList object = new LinkedList();
			for(int i = 0; i < number.length(); i++) {
				String s = number.charAt(i) + "";
				object.insert(s);
			}
			return object;

    }

    public static String digitsToNumber(LinkedList list) {
    	Node nextElemnt = list.first;
    	String string = new String();
			for(int i = 0; i < list.size; i++) {
				string += nextElemnt.data + "";
				nextElemnt = nextElemnt.next;
			}
			return string;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList finalList = new LinkedList();
    	LinkedList slist = new LinkedList();
    	Node elemnt1 = list1.last;
    	Node elemnt2 = list2.last;
    	Node elemnt3 = finalList.first;
    	int m = 0;
    	if (list1.size > list2.size) {
    		slist = list2;
    		m = list1.size - list2.size;
    	} else {
    		slist = list1;
    		m = list2.size - list1.size;
    	}
		for (int i = 0; i < m; i++) {
			list2.insertFirst("0");
		}
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		int sum = 0;
/*		Stack s3 = new Stack();
		Stack s4 = new Stack();*/
			for (int i = 0; i < list1.size; i++) {
				elemnt1 = list1.last;
				elemnt2 = list2.last;
				if (!s1.isEmpty()) {
					sum = Integer.parseInt(elemnt1.data) + Integer.parseInt(elemnt2.data) + Integer.parseInt(s1.pop());
					System.out.println(sum);
					list1.delete();
					list2.delete();
				}
				else {
				sum = Integer.parseInt(elemnt1.data) + Integer.parseInt(elemnt2.data);
				System.out.println(sum);
				list1.delete();
				list2.delete();
				}
				String el3 = sum + "";
				if (el3.length() == 1) {
					finalList.insert(el3);
					s2.push(el3);
				} else {
					String[] a = el3.split("");
					s1.push(a[0]);
					s2.push(a[1]);
				}
				
				/*s1.push(elemnt1.data);
				elemnt1 = elemnt1.next;
			}
			System.out.println(list1.size);
			for(int i = 0; i < list1.size; i++) {
				s2.push(elemnt2.data);
				elemnt2 = elemnt2.next;
			}
/*			System.out.println(s2.pop());
			System.out.println(s2.pop());*/
	/*		int sum = 0;
			String num = "";
			int n1 = list1.size;
			int n2 = list2.size;
			for(int i = 0; i < n1; i++) {
				if (!s4.isEmpty()) {
					sum = Integer.parseInt(s1.pop())
					 + Integer.parseInt(s2.pop()) + Integer.parseInt(s4.pop());
				}
				else {
				sum = Integer.parseInt(s1.pop()) + Integer.parseInt(s2.pop());
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
			}*/
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
