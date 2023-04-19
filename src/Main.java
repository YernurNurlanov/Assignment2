public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> list = new MyArrayList<>();
        list.add(5);
        list.add(12);
        list.add("A");
        list.add(true);
        list.add(1);
        list.add("A");
        list.add(false);
        System.out.println(list.size());
        System.out.println(list.contains(1));
        System.out.println(list.contains("a"));
        list.add(100, 4);
        System.out.println(list.get(4));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.remove(false));
        System.out.println(list.get(0));
        System.out.println(list.indexOf("A"));
        list.clear();
        System.out.println(list.size());
        
        MyLinkedList<Object> list2 = new MyLinkedList<>();
        list2.add(5);
        list2.add(12);
        list2.add("A");
        list2.add(true);
        list2.add(1);
        list2.add("A");
        list2.add(false);
        System.out.println(list2.size());
        System.out.println(list2.contains(12));
        System.out.println(list2.contains("a"));
        list2.add(111, 1);
        System.out.println(list2.get(1));
        list2.remove(3);
        System.out.println(list2.get(3));
        System.out.println(list2.remove(false));
        System.out.println(list2.indexOf("A"));
        System.out.println(list2.lastIndexOf("A"));
        list2.clear();
        System.out.println(list2.size());
    }
}