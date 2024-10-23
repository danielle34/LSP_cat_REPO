/**
*  Name: Morayo Adeyemi
*/
package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor that initializes an empty IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * Constructor if you want to pass in already initialized
     * 
     * @param set the list of integers to initialize the set with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set. 5 pts.
    /**
     * This method clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    // Returns the length of the set. 5 pts.
    /**
     * This method returns the number of elements in the set.
     *
     * @return the legth of the set.
     */
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order. This
     * overrides
     * the equal method from the Object class. 10 pts.
     */

    /**
     * This method checks whether two IntegerSets are equal, meaning they contain the same
     * elements in any order.
     *
     * @param o the object to compare to.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(Object o) {

        if (o instanceof IntegerSet) {
            // got this from
            // https://www.geeksforgeeks.org/list-containsall-method-in-java-with-examples/
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;

    }

    // Returns true if the set contains the value, otherwise false. 5 pts.

    /**
     * This method checks if the set contains a specific integer.
     *
     * @param value the integer to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {

        return set.contains(value);
    }

    // Returns the largest item in the set. 5 pts.
    /**
     * This method finds the largest integer in the set.
     *
     * @return the largest integer in the set.
     */
    public int largest()  {
        if (set.isEmpty()) {
            System.out.println("Your set is empty");
            return -1;
        }

        int max = set.get(0);

        for (int item : set) {
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    // Returns the smallest item in the set. 5 pts.
    /**
     * This method finds the smallest integer in the set.
     *
     * @return the smallest integer in the set.
     */
    public int smallest() {
        if (set.isEmpty()) {
            System.out.println("Your set is empty");
            return -1;
        }

        int min = set.get(0);

        // Loop through the set to find the smallest element
        for (int item : set) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }

    // Adds an item to the set or does nothing it already there. 5 pts.
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }

    }; // adds item to the set or does nothing if it is in set

    // Removes an item from the set or does nothing if not there. 5 pts.
    /**
     * Removes a specified integer from the set if it exists.
     *
     * @param item the integer to be removed.
     */
    public void remove(int item) {
        if (set.isEmpty()) {
            System.out.println("Your set is empty");
        }
        else{
            set.remove(Integer.valueOf(item));
        }

        
    }

    // Set union. 11 pts.
    /**
     * Performs the union of the current set with another set.
     * The union adds all elements from the second set that are not already present
     * in the current set.
     *
     * @param intSetb the second set to perform the union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    };

    // Set intersection, all elements in s1 and s2. 12 pts.
    /**
     * Performs the intersection of the current set with another set.
     * Only elements that are present in both sets will remain in the current set.
     *
     * @param intSetb the second set to perform the intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int item : this.set) {
            if (intSetb.set.contains(item)) {
                intersection.add(item);
            }
        }

        this.set = intersection;
    }

    // Set difference, i.e., s1 –s2. 12 pts.
    /**
     * Performs the difference operation between the current set and another set.
     * Only elements that are in the current set but not in the second set will
     * remain.
     *
     * @param intSetb the second set to subtract from the current set.
     */
    public void diff(IntegerSet intSetb) {
        ArrayList<Integer> differenceSet = new ArrayList<>();

        for (int item : this.set) {
            if (!intSetb.set.contains(item)) {
                differenceSet.add(item);
            }
        }
        this.set = differenceSet;
    } // set difference, i.e. s1 - s2

    // Set complement, all elements not in s1. 11 pts.
    /**
     * Performs the complement of the current set with respect to another set.
     * The result will contain all elements from the second set that are not in the
     * current set.
     *
     * @param intSetb the second set used to compute the complement.
     */
    public void complement(IntegerSet intSetb) {
        ArrayList<Integer> complementSet = new ArrayList<>();

        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                complementSet.add(item);
            }
        }

        this.set = complementSet;
    }

    // Returns true if the set is empty, false otherwise. 5 pts.
    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise.
     */
    boolean isEmpty() {
        return set.size() == 0;
    }

    // Return String representation of your set. This overrides the equal method
    // from
    // the Object class. 5 pts.
    /**
     * Returns the string representation of the set.
     *
     * @return a string representing the set.
     */
    public String toString() {
        return set.toString();
    } // return String representation of your set
}
