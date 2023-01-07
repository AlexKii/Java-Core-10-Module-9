package myLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<String>();

        myList.add("Alex");
        myList.add("Igor");
        myList.add("Andy");
        myList.add("Matt");
        myList.add("Oleg");
        myList.add("Serg");
        myList.add("Kate");
        myList.add("Nika");
        myList.add("Sofia");
        System.out.println("list add() = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        System.out.println("List.get(5) = " + myList.get(5));
        myList.remove(5);
        System.out.println("list.remove(5) = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        System.out.println("List.get(0) = " + myList.get(0));
        myList.remove(0);
        System.out.println("list.remove(0) = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        System.out.println("List.get(6) = " + myList.get(6));
        myList.remove(6);
        System.out.println("list.remove(6) = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        myList.clear();
        System.out.println("list.clear() = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");

        myList.add("Sofia");
        System.out.println("list add() = " + myList);
        System.out.println("list.size() = " + myList.size());
        System.out.println("________________");
    }
}
