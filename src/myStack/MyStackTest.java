package myStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();

        myStack.push("Alex");
        myStack.push("Igor");
        myStack.push("Andy");
        myStack.push("Matt");
        myStack.push("Oleg");
        myStack.push("Serg");
        myStack.push("Kate");
        myStack.push("Nika");
        myStack.push("Sofia");
        myStack.display();
        System.out.println("________________");
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println(myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.remove(0);
        System.out.println("myStack after remove(0) = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.remove(6);
        System.out.println("myStack after remove(6) = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.clear();
        System.out.println("Stack.clear() = " + myStack);
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.push("Alex");
        myStack.push("Igor");
        myStack.push("Andy");
        myStack.push("Matt");
        myStack.push("Oleg");
        myStack.push("Serg");
        myStack.push("Kate");
        myStack.push("Nika");
        myStack.push("Sofia");
        System.out.println("Stack push() = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");
    }
}