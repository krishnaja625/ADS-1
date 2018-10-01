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
			return;
		}
		current.next = start;
		start = current;
	}
	void pop() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		}
/*		int data = start.data;*/
		start = start.next;
		size--;
	}
	void enqueue(int data) {
		Node current = new Node();
		size++;
		if (start == null) {
			current.data = data;
			current.next = null;
			start = current;
		} else {
			Node temp = start;
			while (temp.next != null) {
				temp = temp.next;
			}
			current.data = data;
			temp.next = current;
			current.next = null;
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
		Node temp = start;
		while (temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}