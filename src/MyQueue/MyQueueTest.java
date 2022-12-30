package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<String>();

        myQueue.add("Alex");
        myQueue.add("Igor");
        myQueue.add("Andy");
        myQueue.add("Matt");
        myQueue.add("Oleg");
        myQueue.add("Serg");
        myQueue.add("Kate");
        myQueue.add("Nika");
        myQueue.add("Sofia");
        myQueue.display();
        System.out.println("________________");
        System.out.println("Queue add() = " + myQueue);
        System.out.println("Queue.peek(FIFO) = " + myQueue.peek());
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("________________");

        System.out.println("Queue.poll(FIFO) = " + myQueue.poll());
        System.out.println(myQueue);
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("________________");

        System.out.println("Queue.poll(FIFO) = " + myQueue.poll());
        System.out.println(myQueue);
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("________________");

        myQueue.clear();
        System.out.println("Queue.clear() = " + myQueue);
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("________________");

        myQueue.addHead("Alex");
        myQueue.addHead("Igor");
        myQueue.addHead("Andy");
        myQueue.addHead("Matt");
        myQueue.addHead("Oleg");
        myQueue.addHead("Serg");
        myQueue.addHead("Kate");
        myQueue.addHead("Nika");
        myQueue.addHead("Sofia");
        System.out.println("Queue addHead() = " + myQueue);
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("Queue.peek(FIFO) = " + myQueue.peek());
        System.out.println("________________");

        System.out.println("Queue.poll(FIFO) = " + myQueue.poll());
        System.out.println(myQueue);
        System.out.println("Queue.size() = " + myQueue.size());
        System.out.println("________________");
        myQueue.display();
    }
}