package org.example;
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 9};
        Integer[] array2 = {4, 5, 6, 7, 8, 9};

        // 1. Initialize Sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> duplicates = new HashSet<>();

        // 2. Iterate through second array and check for existence
        for (Integer val : array2) {
            if (set1.contains(val)) {
                duplicates.add(val);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}

//Explanation:1. The Logic

//The core property of a Set is that it cannot contain duplicate elements. We leverage this by using two sets:
//Storage Phase: We add all elements from the first array into a Set (let’s call it set1). Because Sets are backed
//by a Hash Table, this operation is very fast.Comparison Phase: We iterate through the second array and check if each element
//already exists in set1.
//Collection Phase: If an element from the second array is found in set1, it means it exists in both arrays.
//We add that element to a second set (intersectSet) to ensure we don't list the same duplicate twice if the
//second array has internal repeats.