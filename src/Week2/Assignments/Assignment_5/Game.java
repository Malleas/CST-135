package Week2.Assignments.Assignment_5;

import java.util.ArrayList;
import java.util.List;

public class Game {

  public static void main(String[] args) {
    List<WeaponInterface> weapons = new ArrayList<>();
    Bomb bomb = new Bomb(15);
    Gun gun = new Gun(5);
    weapons.add(bomb);
    weapons.add(gun);
    weapons.forEach(weapon -> fireWeapon(weapon));

  }

  private static void fireWeapon(WeaponInterface weapon) {
    weapon.activate(true);
    weapon.fireWeapon();
  }
}
