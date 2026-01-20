import java.util.*;

public class SearchStructureComparison {

    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1_000_000};

        for (int size : sizes) {
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            int target = size - 1;

            long start = System.nanoTime();
            for (int i : array) {
                if (i == target) break;
            }
            long arrayTime = System.nanoTime() - start;

            start = System.nanoTime();
            hashSet.contains(target);
            long hashSetTime = System.nanoTime() - start;

            start = System.nanoTime();
            treeSet.contains(target);
            long treeSetTime = System.nanoTime() - start;

            System.out.println("\nDataset Size: " + size);
            System.out.println("Array Search: " + arrayTime / 1_000_000.0 + " ms");
            System.out.println("HashSet Search: " + hashSetTime / 1_000_000.0 + " ms");
            System.out.println("TreeSet Search: " + treeSetTime / 1_000_000.0 + " ms");
        }
    }
}
