class Node {
		int data;
		Node next;
		Node() {

		}
		Node(int item) {
			this.data = item;
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

	void insert(int item){
		Node obj = new Node();
		obj.data = item;
		if(size == 0){
			first = obj;
			size++;
			return;
		}
		obj.next = first;
		first = obj;
		print();
	}
	void insertLast(int data) {
		Node obj = new Node(data);
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
	int delete(){
		int data = first.data;
		first = first.next;
		size--;
		print();
		return data;
	}
	void print() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
		if (first.next == null) {
			System.out.println(first.data);
			return;
		}
		Node temp = first.next;
		while (temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
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

class Steque{
	LinkedList ll ;
	Steque (){
		ll = new LinkedList();
	}
	void push(int item){
		ll.insert(item);
	}
	int pop(){
		ll.print();
		return ll.delete();
	}
	void enqueue(int item) {
		ll.insertLast(item);
	}
	boolean isEmpty(){
		return ll.isEmpty();
	}
	int size(){
		return ll.size();
	}
}

/*class Steque {
	Node head;
	int size;
	void push(int data) {
		Node current = new Node();
		size++;
		if (head == null) {
			current.data = data;
			current.next = null;
			head = current;
		} else {
			current.data = data;
			current.next = head;
			head = current;
		}
	}
	void pop() {
		if (size == 0) {
			return;
		}
		Node current = new Node();
		Node temp = head;
		temp = temp.next;
		head.next = null;
		head = temp;
		size--;
	}
	void insertLast(int data) {
		Node current = new Node();
		size++;
		if (head == null) {
			current.data = data;
			current.next = null;
			head = current;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			current.data = data;
			temp.next = current;
			current.next = null;
		}
	}
	void print() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
		if (head.next == null) {
			System.out.println(head.data);
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}*/