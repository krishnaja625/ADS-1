	class Node {
		private int data;
		private Node next;
		Node(final int d, final Node n) {
			data = d;
			next = n;
		}
		int getdata() {
			return data;
		}
		void setdata(final int d) {
			data = d;
		}
		Node getnext() {
			return next;
		}
		void setnext(final Node n) {
			next = n;
		}
	}
class LinkedList {
	private Node head;
	private int size;
	LinkedList() {
		head = null;
		size = 0;
	}
	boolean isEmpty() {
		return head == null;
	}
	int getsize() {
		return size;
	}
	void insertAt(int pos, int data) {
		if (pos > size-1) {
		Node first = new Node(data, null);
		if (pos == 0){
				first.setnext(head);
				head = first;
				size++;
				return;
		}
		Node second = head;
		for (int i = 0; i < size; i++) {
			if (i == pos-1) {
				Node temp = second.getnext();
				second.setnext(first);
				first.setnext(temp);
				break;
			}
			second = second.getnext();
		}
		size++;
	} else {
		System.out.println("Can't insert at this position.");
	}
	}
	void reverse() {
		Node previous = null;
		Node present = head;
		Node after = null;
		while(present != null) {
			after = present.getnext();
			present.setnext(previous);
			previous = present;
			present = after;
		}
		head = previous;
	}
	void display() {
		if (size == 0) {
			System.out.println("");
			return;
		}
		if (head.getnext() == null) {
			System.out.println(head.getdata());
			return;
		}
		Node a = head;
		System.out.print(head.getdata() + ", ");
		a = head.getnext();
		while (a.getnext() != null) {
			System.out.print(a.getdata() + ", ");
			a = a.getnext();
		}
		System.out.print(a.getdata() + "\n");
	}
}