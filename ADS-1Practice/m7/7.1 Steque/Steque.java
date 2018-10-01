/**
 * Class for node.
 */
class Node {
		int data;
		Node next;
	}
	/**
	 * Class for steque.
	 */
class Steque {
	Node start;
	Node last;
	int size;
	/**
	 * The number of operations of the function push is constant time.
	 * Time complexity is O(1) 
	 *
	 * @param      item  The item
	 */
	void push(int item) {
		Node current = new Node();
		current.data = item;
		if(size == 0){
			start = current;
			size++;
			print();
			return;
		}
		current.next = start;
		start = current;
		size++;
		print();
	}
	/**
	 * the function is to pop out an element and the
	 * operations in this function takes constant time.
	 * Time complexity is O(1)
	 */
	void pop() {
		if (size == 0) {
			System.out.println("Steque is empty.");
			return;
		} else {
		start = start.next;
		size--;
		}
		// int data = start.data;

		print();
	}
	/**
	 * The function enqueue is to add an element at the beginning.
	 * the while loop in the function takes time complexity of N.
	 * Time complexity is O(N)
	 *
	 * @param      data  The data
	 */
	void enqueue(int data) {
		Node current = new Node();
		size++;
		if (start == null) {
			current.data = data;
			current.next = null;
			start = current;
			print();
		} else {
			Node tmp = start;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			current.data = data;
			tmp.next = current;
			current.next = null;
			print();
		}
		
	}
	/**
 	 * The function print is to print all the elements.
	 * the while loop in the function takes time complexity of N.
	 * Time complexity is O(N)
 	*/
	void print() {
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