/**
 * LinkedList implementaing Stack.
 */
class CircularLinkedList {

    /**
     * Node for head item.
     */
    private Node head = null;
    /**
     * Node for tail item.
     */ 
    private Node tail = null;

    /**
     * Node for present item.
     */
    private Node present = null;

    /**
     * Class for node.
     */
    class Node {
        /**
         * T data item.
         */
        private int data;

        /**
         * Node next.
         */
        private Node next;

    }

    /**
     * check whether stack is empty or not.
     * @return true or false.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * push method is used to push the item.
     * @param item item to push.
     */
    public void add(final int item) {
        if (head == null) {
            head = new Node();
            head.data = item;
            tail = head;
            head.next = tail;
        } else {
            Node newnode = new Node();
            tail.next = newnode;
            newnode.data = item;
            newnode.next = head;
            tail = newnode;
        }

    }

    public int getNext() {
        if (present == null) {
            present = head;
        }
        Node tmp = present;
        present = tmp.next;
        return tmp.data;
    }


    public int remove(int item) {
        if (head.next == head && head.data == item) {
            int tmp = head.data;
            head = null;
            return tmp;
        }
        if (head.data == item) {
            head = head.next;
            tail.next = head;
            return item;
        }
        if (tail.data == item) {
            Node tempp = head;
            while (!(tempp.next == tail)) {
                tempp = tempp.next;
            }
            tempp.next = head;
            tail = tempp;
            return item;
        }
        Node prsntTemp = head;
        while (!(prsntTemp.next.data == item)) {
            prsntTemp = prsntTemp.next;
        }
        Node tmp2 = prsntTemp.next.next;
        prsntTemp.next = tmp2;

        return item;
    }
}