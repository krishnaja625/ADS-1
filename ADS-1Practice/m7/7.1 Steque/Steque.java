class Steque {
class Node {
		int data;
		Node next;
	}
	Node start;
	Node last;
	int size;
	void push(int item) {
		Node current = new Node();
		current.data = item;
		if(size == 0){
			start = current;
			size++;
			display();
			return;
		}
		current.next = start;
		start = current;
		display();
	}
	void pop() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
		// int data = start.data;
		start = start.next;
		size--;
		display();
	}
	void enqueue(int data) {
		Node current = new Node();
		size++;
		if (start == null) {
			current.data = data;
			current.next = null;
			start = current;
			display();
		} else {
			Node tmp = start;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			current.data = data;
			tmp.next = current;
			current.next = null;
			display();
		}
		
	}
	void display() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
		if (start.next == null) {
			System.out.println(start.data);
			return;
		}
		Node tmp = start;
		while (tmp.next != null) {
			System.out.print(tmp.data + ", ");
			tmp = tmp.next;
		}
		System.out.println(tmp.data);
	}
}