package MyStack;

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
        System.out.println("Stack push() = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.pop();
        System.out.println("Stack.pop(LIFO) = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");

        myStack.pop();
        System.out.println("Stack.pop(LIFO) = " + myStack);
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
        myStack.display();
        System.out.println("________________");
        System.out.println("Stack push() = " + myStack);
        System.out.println("Stack.peek(LIFO) = " + myStack.peek());
        System.out.println("Stack.size() = " + myStack.size());
        System.out.println("________________");
    }
}