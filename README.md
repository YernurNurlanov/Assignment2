# Assignment2
## MyArrayList
### MyArrayList
*Description:* Constructor to initialize the array with a capacity of 5 elements
```
public MyArrayList() {
    this.arr = (T[]) new Object[5];
    this.size = 0;
    }
```
### size
*Description:* Returns the size of the array
```
public int size() {
    return size;
    }
```
### contains
*Description:* Checks if there is an incoming element in the array
```
public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == arr[i]) {
                return true;
            }
        }
        return false;
    }
```
### add
*Description:* Adds an element to the end of the array, increasing the capacity if necessary
```
public void add(T item) {
        // if the array is full, create a new array with double the capacity
        if (size == arr.length) {
            T[] Arr = (T[]) new Object[arr.length * 2];
            // copy elements from old array to new array
            for (int i = 0; i < arr.length; i++) {
                Arr[i] = arr[i];
            }
            // set the reference to the new array
            arr = Arr;
        }
        else {
            arr[size] = item;
        }
        size++;
    }
```
### add
*Description:* Adds an element at the specified index, throwing an exception if the index is out of bounds
```
public void add(Object item, int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        arr[index] = (T) item;
    }
```
### remove
*Description:* Checks if an element has been deleted
```
public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (item == arr[i]) {
                return false;
            }
        }
        return true;
    }
```
### remove
*Description:* Removes the element at the specified index, throwing an exception if the index is out of bounds
```
public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Shift all elements to the left by one position
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
```
### clear
*Description:* Clears the array by creating a new array with a capacity of 5 elements and setting the size to 0
```
public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
```
### get
*Description:* Returns the element at the specified index, throwing an exception if the index is out of bounds
```
public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
```
### indexOf
*Description:* Returns index of the element which first matched the incoming element
```
public int indexOf(Object o) {
        for (int i = 0; i < size; i++){
            if (o == arr[i]){
                return i;
            }
        }
        return -1;
    }
```
### lastIndexOf
*Description:* Returns index of the element which last matched the incoming element
```
public int lastIndexOf(Object o) {
        int index = 0;
        for (int i = 0; i < size; i++){
            if (o == arr[i]) {
                index = i;
            }
        }
        return index;
    }
```
### sort
*Description:* Sorts array only if it contains only integer, otherwise throws an exception
```
public void sort() {
        int n = arr.length;
        try {
            // Bubble sort
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
```
## MyLinkedList
### Node
*Description:* Node class for each element in the linked list
```
private class Node {
        private E element;
        private Node next;
        private Node previous;
        // Constructor for a new node
        public Node(E element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
```
### MyLinkedList
*Description:* Constructor for an empty linked list
```
public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
```
### size
*Description:* Returns the length of linked list
```
public int size() {
        return size;
    }
```
### contains
*Description:* Checks if the linked list contains a given object
```
public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
```
### add
*Description:* Adds a new element to the end of the linked list
```
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
```
### add
*Description:* Adds a new element to the linked list at a specified index, throwing an exception if the index is out of bounds
```
public void add(Object item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add((E) item);
            return;
        }
        Node newNode = new Node((E) item, null, null);
        if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else {
            Node current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.previous;
                }
            }
            newNode.next = current;
            newNode.previous = current.previous;
            current.previous.next = newNode;
            current.previous = newNode;
        }
        size++;
    }
```
### remove
*Description:* Checks if an element has been deleted
```
public boolean remove(Object item) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
```
### remove
*Description:* Removes an element from the linked list at a specified index, throwing an exception if the index is out of bounds
```
public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index == 0) {
            current = head;
            head = current.next;
            if (head != null) {
                head.previous = null;
            }
        }
        else if (index == size - 1) {
            current = tail;
            tail = current.previous;
            if (tail != null) {
                tail.next = null;
            }
        }
        else {
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            }
            else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.previous;
                }
            }
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
    }
```
### clear
*Description:* clears linked list
```
public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
```
### get
*Description:* Returns the element at the specified index, throwing an exception if the index is out of bounds
```
public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }
        return current.element;
    }
```
### indexOf
*Description:* Returns index of the element which first matched the incoming element
```
public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
```
### lastIndexOf
*Description:* Returns index of the element which last matched the incoming element
```
public int lastIndexOf(Object o) {
        Node current = tail;
        int index = size - 1;
        while (current != null) {
            if (current.element.equals(o)) {
                return index;
            }
            current = current.previous;
            index--;
        }
        return -1;
    }
```
