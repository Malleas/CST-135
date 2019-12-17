package Week2.Assignments.Assignment_4;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 12-02-2019 for use in CST-105
 */
public class Game {

  public static void main(String[] args) {
    Random random = new Random();
    int health1 = random.nextInt(1000 + 1);
    int health2 = random.nextInt(1000 + 1);
    System.out.println("Setting up our Super Heroes..........");
    Superman superman = new Superman(health1);
    Batman batman = new Batman(health2);
    System.out.println("Super Heroes created!!!!!" + "\n" + "Batman's starting health is: " + batman.health + "\n"
     + "Superman's starting health is: " + superman.health + "\n\n\n");
    System.out.println("Running the game.........");
     while (!superman.isDead() && !batman.isDead()) {
       superman.attack(batman);
       batman.attack(superman);

       if (superman.isDead())
       {
         System.out.println("Superman as died, Batman's money and technology has saved the day!");
       }
       if (batman.isDead())
       {
         System.out.println("Batman is dead, cut in half my Superman's laser eyes");
       }
     }
  }
}
