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
		String data = first.data;
		first = first.next;
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
    	Node elemnt1 = list1.first;
    	Node elemnt2 = list2.first;
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
		Stack s3 = new Stack();
		Stack s4 = new Stack();
			for(int i = 0; i < list1.size; i++) {
				s1.push(elemnt1.data);
				elemnt1 = elemnt1.next;
			}
			for(int i = 0; i < list2.size; i++) {
				s2.push(elemnt2.data);
				elemnt2 = elemnt2.next;
			}
			int sum = 0;
			String num = "";
			for(int i = 0; i < list2.size; i++) {
				if (!s4.isEmpty()) {
					sum = Integer.parseInt(s1.pop()) + Integer.parseInt(s2.pop()) + Integer.parseInt(s4.pop());
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

			}
return finalList;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
