public class MyArrayList<T> implements MyList<T>{
    private int size;
    private T[] arr;
    public MyArrayList(){
        this.arr = (T[]) new Object[5];
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
    public void add(T item) {
        if (size == arr.length){
            T[] Arr = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++){
                Arr[i] = arr[i];
            }
            arr = Arr;
        }
        else {
            arr[size] = item;
        }
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
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        for(int i = index + 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }
    @Override
    public void clear() {

    }
    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
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