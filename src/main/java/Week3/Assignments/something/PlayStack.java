package Week3.Assignments.something;

import java.util.Iterator;
import java.util.Stack;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class PlayStack {

  public static void main(String[] args) {
    Stack<Integer> integerStack = new Stack<>();
    Stack<String> stringStack = new Stack<>();
    integerStack.push(1);
    integerStack.push(2);
    integerStack.push(3);
    integerStack.push(4);
    integerStack.push(5);

    stringStack.push("Hello");
    stringStack.push("My");
    stringStack.push("Name");
    stringStack.push("Is");
    stringStack.push("Matt");

    System.out.printf("Name: %s Size: %s secondElement: %s\n", "integerStack", integerStack.size(), integerStack.get(1));
    System.out.printf("Name: %s Size: %s secondElement: %s\n", "stringStack", stringStack.size(), stringStack.get(1));

    System.out.println("Printing integerStack using toString()");
    System.out.println(integerStack.toString());

    System.out.println("Printing stringStack using a while loop");
    Iterator<String> itr = stringStack.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

  }
}
