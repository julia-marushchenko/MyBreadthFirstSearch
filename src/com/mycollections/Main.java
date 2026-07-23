/**
 *  Java program to realize Breadth First Search.
 */

package com.mycollections;

import java.util.*;

// Main class.
public class Main {
    public static void main(String[] args) {

        // Creating a graph.
        List<List<Integer>> graph = new ArrayList<>();

        // Lines of the graph..
        List<Integer> list0 = new ArrayList<>();
        list0.add(0);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);

        // Add.
        graph.add(list0);
        graph.add(list1);
        graph.add(list2);
        graph.add(list3);

        // Calling method realisationBFS().
        realisationBFS(graph, 4);
    }

    // Method to search through the graph.
    public static void realisationBFS(List<List<Integer>> graph, int src){

        int index = 0;

        // Iterating through the graph.
        while (graph.size() > 0){

            // Element to remove.
            List<Integer> removed = graph.get(index);

            // Processing the removed elements.
            // Printing removed element.
            System.out.println(removed);
            graph.remove(0);
        }
    }

}