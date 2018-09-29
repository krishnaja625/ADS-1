import java.util.Scanner;
class Node{
	String data;
	Node next;
/*	Node(){

	}
	Node(String data){
		this.data = data;
	}*/
}
class LinkedList{
	Node first;
	int size;
	LinkedList(){
		first = new Node();
		size = 0;
	}

	void insert(String item){
		Node obj = new Node();
		obj.data = item;
		if(size == 0){
			first = obj;
			size++;
			return;
		}
		obj.next = first;
		first = obj;
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

/*class Stack{
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
*/class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList object = new LinkedList();
			for(int i = 0; i < number.length(); i++) {
				String s = number.charAt(i) + "";
				object.insert(s);
			}
			return object;

    }

    public static String digitsToNumber(LinkedList list) {
return null;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
return null;
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
/*
            case "addLargeNumbers":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;*/
        }
    }
    
}
