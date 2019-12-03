package Week_2.Assignments.Assignment_4;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 12-02-2019 for use in CST-105
 */
public class SuperHero {

  String name;
  int health;
  boolean isDead;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public boolean isDead() {
    return isDead;
  }

  public SuperHero(String name, int health) {
    this.name = name;
    this.health = health;
  }

  public void attack(SuperHero opponent) {
    System.out.println("Hero's Name: " + opponent.name);
    Random random = new Random();
    System.out.println("Current Health: " + opponent.health);
    int damage = random.nextInt(10);
    System.out.println("Damage This Round: " + damage);
    opponent.determineHealth(damage);
   System.out.println("Health after Damage: " + opponent.health);
   System.out.println("Is Hero Dead?: " + opponent.isDead() + "\n");

  }

  private void determineHealth(int damage){
   if (this.health - damage <= 0){
     this.health = 0;
     this.isDead = true;
   }
   this.health = this.health - damage;
  }
}
