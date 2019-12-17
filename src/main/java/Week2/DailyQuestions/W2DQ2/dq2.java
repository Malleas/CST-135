package Week2.DailyQuestions.W2DQ2;

/**
 * All work is created by Matt Sievers on 12-02-2019 for use in CST-105
 */

/**
 * Examine the code example in Section 11.5 of the textbook. Code a similar example of overriding the method of a parent
 * class using the example of a class called Vehicle (parent class), Car (child of Vehicle) and Jet (also child of
 * Vehicle). Use "Move" as the method to override. The move method can simply print a line of text that is appropriate
 * for its object type.
 */
public class dq2 {

  public static void main(String[] args) {
    Car car = new Car();
    Jet jet = new Jet();
    Vehicle v = new Vehicle();
    v.move(32);
    car.move(50);
    jet.move(15);

  }
}

class Vehicle {
  public void move(int distance) {
    System.out.println("This is the parent Vehicle class where distance is mulitplied by 2 and == " + distance * 2);
  }
}

class Car extends Vehicle {
  public void move(int distance) {
    System.out.println("This is the Car child class and distance is: " + distance);
  }
}

class Jet extends Vehicle {
  public void move(int distance) {
    System.out.println("This is the Jet child class and distance is: " + distance / 2);
  }
}