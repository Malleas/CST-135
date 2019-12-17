package Week3.Assignments.something;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class PlayQueue {
  public static void main(String[] args) {

    Queue<Integer> integerQueue = new LinkedList<>();
    Queue<String> stringQueue = new LinkedList<>();
    integerQueue.add(1);
    integerQueue.add(2);
    integerQueue.add(3);
    integerQueue.add(4);
    integerQueue.add(5);

    stringQueue.add("Hello");
    stringQueue.add("My");
    stringQueue.add("Name");
    stringQueue.add("Is");
    stringQueue.add("Matt");

    System.out.printf("Name: %s Size: %s isHead: %s\n", "integerQueue", integerQueue.size(), integerQueue.peek());
    System.out.printf("Name: %s Size: %s isHead: %s\n", "stringQueue", stringQueue.size(), stringQueue.peek());

    System.out.println("Printing integerQueue using toString():");
    System.out.println(integerQueue.toString());

    System.out.println("Printing stringQueue using a while loop");
    Iterator<String> itr = stringQueue.iterator();
    while (itr.hasNext()){
      System.out.println(itr.next());
    }

  }
}
