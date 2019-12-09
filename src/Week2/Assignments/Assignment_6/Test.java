package Week2.Assignments.Assignment_6;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Test {

  public static void main(String[] args) {
    Person person1 = new Person("Bob", "Smith");
    Person person2 = new Person("Bob", "Smith");
    Person person3 = new Person(person1);

    System.out.println(person1.getFirstName() + person1.getLastName());
    System.out.println(person3.getFirstName() + person1.getLastName());

    if (person1 == person2) {
      System.out.println("These persons are identical using ==");
    } else {
      System.out.println("These persons are not identical using ==");
    }

    if (person1.equals(person2)) {
      System.out.println("These persons are identical using .equals()");
    } else {
      System.out.println("These persons are not identical using .equals()");
    }

    if (person1.equals(person3)) {
      System.out.println("These persons are identical using .equals()");
    } else {
      System.out.println("These persons are not identical using .equals()");
    }

    System.out.println(person1.toString());
    System.out.println(person2.toString());
  }
}
