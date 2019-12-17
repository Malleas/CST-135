package Week2.Assignments.Assignment_5;

public class Bomb implements WeaponInterface {

  private int power;


  public void setPower(int power) {
    this.power = power;
  }

  @Override
  public void activate(boolean enable) {
    System.out.println("In the Bomb.activate() with an enable of " + enable);
  }

  @Override
  public int getPower() {
    return this.power;
  }


  @Override
  public void fireWeapon() {
    System.out.println("In Bomb.fireWeapon() with a power of " + this.power);
  }

  @Override
  public void fireweapon(int power) {
    System.out.println("In Bomb.fireWeapon() with a power of " + this.power);
  }

  public Bomb() {
  }

  public Bomb(int power) {
    this.power = power;
  }
}
