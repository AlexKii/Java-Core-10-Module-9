package myHashMap;

public class MyHashMapTest {
        public static void main(String[] args) {
            MyHashMap<Integer, String> myMap = new MyHashMap<Integer, String>();

            myMap.put(1, "Alex");
            myMap.put(2, "Igor");
            myMap.put(3, "Andy");
            myMap.put(4, "Matt");
            myMap.put(5, "Oleg");
            myMap.put(2, "Serg");
            myMap.put(7, "Kate");
            myMap.put(8, "Nika");
            myMap.put(1, "Sofia");
            myMap.display();
            System.out.println("Map.size() = " + myMap.size());
            System.out.println("________________");
            myMap.remove(2);
            System.out.println("Map.size() after myMap.remove(2) = " + myMap.size());
            myMap.display();
            System.out.println("________________");

            System.out.println("myMap.get(8) = " + myMap.get(8));
            System.out.println("________________");

            myMap.clear();
            myMap.display();
            System.out.println("list.size() = " + myMap.size());
            System.out.println("________________");

            myMap.put(1, "Alex");
            myMap.put(2, "Igor");
            myMap.put(3, "Andy");
            myMap.put(4, "Matt");
            myMap.put(5, "Oleg");
            myMap.put(2, "Serg");
            myMap.put(7, "Kate");
            myMap.put(8, "Nika");
            myMap.put(1, "Sofia");
            myMap.display();
            System.out.println("list.size() = " + myMap.size());
            System.out.println("________________");


        }

}
