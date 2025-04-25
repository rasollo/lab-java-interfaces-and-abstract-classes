package Task4;

public class Main {
    public static void main(String[] args) {
        // Array List
        IIntList arrayList = new IntArrayList();
        for (int i = 1; i <= 15; i++) {
            arrayList.add(i + 10);
        }
        // Print 15 array elements
        for (int i = 0; i < 15; i++) {
            System.out.println("Index " + i + ": " + arrayList.get(i));
        }

        // Vector List
        IIntList vector = new IntVector();
        for (int i = 1; i <= 25; i++) {
            vector.add(i * 100);
        }

        // Print 25 vector elements
        System.out.println("Elements in IntVector:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Index " + i + ": " + vector.get(i));
        }
    }
}