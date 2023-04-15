public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> list = new MyArrayList<>();
        list.add(5);
        list.add(12);
        list.add("A");
        list.add(true);
        list.add(1);
        list.add("Q");
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
    }
}