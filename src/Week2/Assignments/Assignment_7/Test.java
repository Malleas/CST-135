package Week2.Assignments.Assignment_7;

import java.util.Arrays;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Test {

  public static void main(String[] args) {
    Person[] persons = new Person[10];
    persons[0] = new Person("Joan", "Jett", 32);
    persons[1] = new Person("Marilyn", "Manson", 52);
    persons[2] = new Person("Johny", "Cash", 76);
    persons[3] = new Person("Michael", "Jackson", 60);
    persons[4] = new Person("Scott", "Sapp", 32);
    persons[5] = new Person("Wayne", "Static", 49);
    persons[6] = new Person("Rob", "Zombie", 53);
    persons[7] = new Person("Tommy", "Lee", 60);
    persons[8] = new Person("Lindsey", "Sterling", 32);
    persons[9] = new Person("Ozzy", "Osbourne", 100);
    Arrays.sort(persons);
    for(int i=0; i<persons.length; i++){
      System.out.println(persons[i]);
    }


  }
}
