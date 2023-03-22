package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListDemo {
  public static void main(String[] args) {
    // Create a list of Double objects

    List<Double> num = new ArrayList<>();
    num.add(7.14);
    num.add(1.0);
    num.add(2.718);
    num.add(0.1);
    System.out.println("list is: "+ num);
    //num in list is here
//    System.out.println(num);
// Sort the list in ascending order
    Collections.sort(num);

 // Display the sorted elements
    System.out.println("Sorted numbers: " + num);

    //search for an element in the list
    double searchElement=2.718;
    int index= Collections.binarySearch(num,searchElement);
    if (index >= 0) {
      System.out.println("found at index: "+ index);
    }
  }
}