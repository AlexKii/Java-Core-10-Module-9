package myArrayList;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<E> {
    private static final int INIT_CAPACITY = 10;
    private Object[] data = new Object[INIT_CAPACITY];
    private int index;

    public void add(E value) {
        data[index] = value;
        index++;
        if (index == data.length) resizeList();
    }

    private void resizeList() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public void remove(int i) {
        if (index == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (i < 0 || i > index - 1) throw new IndexOutOfBoundsException("Invalid index: " + i + ", Size: " + size());
        if (i < index) {
            data[i] = null;
            for (int j = 0; j < index - 1; j++) {
                if (data[j] == null) {
                    data[j] = data[j + 1];
                    data[j + 1] = null;
                }
            }
            index--;
        }
    }

    public void clear() {
        for (int i = 0; i < index; i++) {
            data[i] = null;
        }
        index = 0;
        data = Arrays.copyOf(data, INIT_CAPACITY);
    }

    public int size() {
        return index;
    }

    public E get(int i) {
        if (index == 0) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (i < 0 || i > index - 1) throw new IndexOutOfBoundsException("Invalid index: " + i + ", Size: " + size());
        return (E) data[i];
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }
}
