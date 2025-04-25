package Task4;

public class IntVector implements IIntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public IntVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length * 2; // Double the size
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            System.out.println("Invalid index: " + id);
        }
        return array[id];
    }
}