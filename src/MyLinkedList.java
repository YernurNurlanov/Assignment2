public class MyLinkedList<E> implements MyList<E>{
    private class Node {
        private E element;
        private Node next;
        private Node previous;
        public Node(E element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public void add(E item) {
        Node newNode = new Node(item, null, tail);
        if (size == 0) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }
    @Override
    public void add(Object item, int index) {

    }
    @Override
    public boolean remove(Object item) {
        return false;
    }
    @Override
    public void remove(int index) {

    }
    @Override
    public void clear() {

    }
    @Override
    public E get(int index) {
        return null;
    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public void sort() {

    }
}
