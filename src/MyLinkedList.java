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
    @Override
    public int size() {
        return 0;
    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public void add(E item) {

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
