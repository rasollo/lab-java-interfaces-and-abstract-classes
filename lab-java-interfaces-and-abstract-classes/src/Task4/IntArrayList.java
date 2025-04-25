package Task4;

public class IntArrayList implements IIntList {
    private int[] array;
    private int size;
    private static final int MAX_ITEMS = 10;

    public IntArrayList() {
        this.array = new int[MAX_ITEMS];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length + (array.length / 2); // 50% larger
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