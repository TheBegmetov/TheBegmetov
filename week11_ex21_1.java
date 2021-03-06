package com.example.salemjavafx;

import java.util.*;

public class week11_ex21_1 {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList(
                "George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList(
                "George", "Katie", "Kevin", "Michelle", "Ryan"));

        Set<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of the two sets: " + union);
        Set<String> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of the two sets: " + difference);
        Set<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of the two sets: " + intersection);
    }
}
