package Week3.Assignments.something;

import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class PlayLIst {

  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    intList.add(4);
    intList.add(5);
    stringList.add("Hello");
    stringList.add("My");
    stringList.add("Name");
    stringList.add("Is");
    stringList.add("Matt");

    /**
     * print first element of list to console.
     */

    System.out.println("The first element in intList[] is: " + intList.get(0));
    System.out.println("The first element in stringList[] is: " + stringList.get(0));

    System.out.println("Printing the intList using a forEach loop: ");
    intList.forEach(i -> System.out.println(i));

    System.out.println("Printing the stringList using a do/while loop: ");
    int i = 0;
    do {
      System.out.println(stringList.get(i));
      i++;
    }while (i<stringList.size());

  }
}
