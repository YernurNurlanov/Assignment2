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
        for (int i = 0; i < size; i++){
            if (o == arr[i]){
                return true;
            }
        }
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
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        arr[index] = (T) item;
    }
    @Override
    public boolean remove(Object item) {
        for (int i = 0; i < size; i++){
            if (item == arr[i]){
                return false;
            }
        }
        return true;
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
        this.arr = (T[]) new Object[5];
        this.size = 0;
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
        for (int i = 0; i < size; i++){
            if (o == arr[i]){
                return i;
            }
        }
        return -1;
    }
    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        for (int i = 0; i < size; i++){
            if (o == arr[i]) {
                index = i;
            }
        }
        return index;
    }
    @Override
    public void sort() {
        int n = arr.length;
        try {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if ((int)arr[j] > (int)arr[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        catch (UnsupportedOperationException e){
            System.out.println("Array has element which is not integer");
        }

    }
}