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
	private Node tail;
	private int size;
	LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	boolean isEmpty() {
		return head == null;
	}
	int getsize() {
		return size;
	}
	void insertAt(int pos, int data) {
		Node first = new Node(data, null);
		Node second = head;
		pos--;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node temp = second.getnext();
				second.setnext(first);
				first.setnext(temp);
				break;
			}
			second = second.getnext();
		}
		size++;
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
		Node first = head;
		System.out.print(head.getdata());
		first = head.getnext();
		while (first.getnext() != null) {
			System.out.print(first.getdata());
			first = first.getnext();
		}
		System.out.print(", " + first.getdata() + "\n");
	}
}