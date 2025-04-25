package Task4;
import java.util.concurrent.TimeUnit;

public class PerformanceComparison {
    private static final int TEST_SIZE = 1000000; // 1 million operations

    public static void main(String[] args) {
        warmUp();

        // Benchmark IntArrayList
        long arrayListAddTime = benchmarkArrayListAdd();
        long arrayListGetTime = benchmarkArrayListGet();

        // Benchmark IntVector
        long vectorAddTime = benchmarkVectorAdd();
        long vectorGetTime = benchmarkVectorGet();

        // Print results
        printResults(arrayListAddTime, arrayListGetTime,
                vectorAddTime, vectorGetTime);
    }

    private static void warmUp() {
        IIntList warmList = new IntArrayList();
        for (int i = 0; i < 10000; i++) {
            warmList.add(i);
            warmList.get(i);
        }
    }

    private static long benchmarkArrayListAdd() {
        IIntList list = new IntArrayList();
        long startTime = System.nanoTime();

        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        return System.nanoTime() - startTime;
    }

    private static long benchmarkArrayListGet() {
        IIntList list = new IntArrayList();
        // Pre-fill the list
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        // Access all elements
        for (int i = 0; i < TEST_SIZE; i++) {
            list.get(i);
        }

        return System.nanoTime() - startTime;
    }

    private static long benchmarkVectorAdd() {
        IIntList list = new IntVector();
        long startTime = System.nanoTime();

        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        return System.nanoTime() - startTime;
    }

    private static long benchmarkVectorGet() {
        IIntList list = new IntVector();
        // Pre-fill the list
        for (int i = 0; i < TEST_SIZE; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        // Access all elements
        for (int i = 0; i < TEST_SIZE; i++) {
            list.get(i);
        }

        return System.nanoTime() - startTime;
    }

    private static void printResults(long alAdd, long alGet, long vAdd, long vGet) {
        System.out.println("\n=== Performance Results ===");
        System.out.printf("IntArrayList add time: %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(alAdd));
        System.out.printf("IntArrayList get time: %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(alGet));
        System.out.printf("IntVector add time:    %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(vAdd));
        System.out.printf("IntVector get time:    %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(vGet));

        System.out.println("\n=== Performance Comparison ===");
        System.out.printf("Add operations: IntVector is %.2fx %s than IntArrayList%n",
                (double)vAdd/alAdd,
                vAdd > alAdd ? "slower" : "faster");
        System.out.printf("Get operations: IntVector is %.2fx %s than IntArrayList%n",
                (double)vGet/alGet,
                vGet > alGet ? "slower" : "faster");
    }
}