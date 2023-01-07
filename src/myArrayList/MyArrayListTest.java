package myArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        myList.add("Alex");
        myList.add("Igor");
        myList.add("Andy");
        myList.add("Matt");
        myList.add("Oleg");
        myList.add("Serg");
        myList.add("Kate");
        myList.add("Nika");
        myList.add("Sofia");
        System.out.println("list = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("List.get(4) = " + myList.get(4));
        System.out.println("________________");

        myList.remove(4);
        System.out.println("list.remove(4) = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        myList.clear();
        System.out.println("list.clear() = " + myList);
        System.out.println("list.size() = " + myList.size());

    }
}
