class Node {
		int data;
		Node next;
	}
class Steque {
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
}