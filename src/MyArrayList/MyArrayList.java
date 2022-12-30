package MyArrayList;

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
        if (i < 0) throw new IndexOutOfBoundsException("Invalid index: " + i);
        if (i < index) {
            data[i] = null;
            for (int j = 0; j < index - 1; j++) {
                if (data[j] == null) {
                    data[j] = data[j + 1];
                    data[j + 1] = null;
                }
            }
            index--;
        } else throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
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
        if (i < 0) throw new IndexOutOfBoundsException("Invalid index: " + i);
        if (i < index) return (E) data[i];
        else throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
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
