package Week3.Assignments.something;

import java.util.HashMap;
import java.util.Map;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class PlayMap {

  public static void main(String[] args) {

    HashMap<Integer, Integer> intMap = new HashMap();
    intMap.put(1, 1);
    intMap.put(2, 2);
    intMap.put(3, 3);
    intMap.put(4, 4);
    intMap.put(5, 5);

    HashMap<Integer, String> stringMap = new HashMap<>();
    stringMap.put(1, "Hello");
    stringMap.put(2, "My");
    stringMap.put(3, "Name");
    stringMap.put(4, "Is");
    stringMap.put(5, "Matt");

    System.out.println("The size of intMap is: " + intMap.size() + " and the the map is empty? " + intMap.isEmpty());
    System.out.println("The size of stringMap is: " + stringMap.size() + " and the the map is empty? " + stringMap.isEmpty());

    System.out.println("Printing the string map using a for loop:");
    for(Map.Entry<Integer, String> m : stringMap.entrySet() ){
      System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
    }

    System.out.println("Clearing all maps");
    intMap.clear();
    System.out.println("intMap cleared");
    stringMap.clear();
    System.out.println("stringMap Cleared");
    System.out.printf("Map Name: %s Size: %s isEMpty: %s\n", "intMap", intMap.size(), intMap.isEmpty());
    System.out.printf("Map Name: %s Size: %s isEMpty: %s\n", "stringMap", stringMap.size(), stringMap.isEmpty());
  }


}
