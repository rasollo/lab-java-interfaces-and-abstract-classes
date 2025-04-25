![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Interfaces and Abstract Classes

## Introduction

This is the mandatory LAB for Interface and Abstract Classes.
## Tasks:

### Car Inventory System

#### Usage examples:

  ```java
        System.out.println(rounder(BigDecimal.valueOf(4.25435)));
        // Example for certifying the method returns a double:
        double b = rounder(BigDecimal.valueOf(4.257));
        System.out.println(b);
        
        // Change signal and round examples:
        System.out.println(changeSignal(BigDecimal.valueOf(1.2345)));
        System.out.println(changeSignal(BigDecimal.valueOf(-45.67)));
  ```

### Video Streaming Service

#### Usage examples:
  ```java
        Sedan sedan = new Sedan("123","1923","Santana","100000");
        sedan.getInfo();
        UtilityVehicle utility = new UtilityVehicle("124","1234","F1000","100",true);
        utility.getInfo();
        Truck truck = new Truck("123123","1950","Trucking","12030213",1200.0);
        truck.getInfo();
  ```

### Movies
#### Usage examples:
```java
        TvSeries tvseries = new TvSeries("Ragnar",120,20);
        tvseries.getInfo();
        Movie movie = new Movie("Mr. Bean", 120, 5);
        movie.getInfo();
  ```
### IntList Interface
#### Usage examples:
```java
        // Array List
        IIntList arrayList = new IntArrayList();
        for (int i = 1; i <= 15; i++) {arrayList.add(i + 10);}
        // Print 15 array elements
        for (int i = 0; i < 15; i++) {System.out.println("Index " + i + ": " + arrayList.get(i));}
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
  ```
### Benchmark tests (PerformanceComparison):
#### Usage examples:
```java
        // Benchmark IntArrayList - Creates and get array list timing:
        long arrayListAddTime = benchmarkArrayListAdd();
        long arrayListGetTime = benchmarkArrayListGet();
        // Benchmark IntVector - Creates and get vector list timing:
        long vectorAddTime = benchmarkVectorAdd();
        long vectorGetTime = benchmarkVectorGet();
        // Print results
        printResults(arrayListAddTime, arrayListGetTime, vectorAddTime, vectorGetTime);
  ```
After testing, in most of the cases, IntVector is faster than IntArrayList as following: 
<br>
=== Performance Results ===<br>
IntArrayList add time: 5 ms<br>
IntArrayList get time: 3 ms<br>
IntVector add time:    5 ms<br>
IntVector get time:    1 ms<br>

=== Performance Comparison ===<br>
Add operations: IntVector is 0.96x faster than IntArrayList<br>
Get operations: IntVector is 0.58x faster than IntArrayList<br>


### RODRIGO CONDE ATTANASIO - IRONHACK
## EOF