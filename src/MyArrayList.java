public class MyArrayList<T> implements MyList<T>{
    private int size;
    private T[] arr;
    @Override
    public int size() {
        return 0;
    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    @Override
    public void add(Object item) {

    }
    @Override
    public void add(Object item, int index) {

    }
    @Override
    public boolean remove(Object item) {
        return false;
    }
    @Override
    public T remove(int index) {
        return null;
    }
    @Override
    public void clear() {

    }
    @Override
    public T get(int index) {
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