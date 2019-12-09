package Week2.Assignments.Assignment_5;

public class Game {

    public static void main(String[] args) {
        Bomb bomb = new Bomb();
        Gun gun = new Gun();

        bomb.activate(false);
        gun.activate(true);

        bomb.fireWeapon(15);
        gun.fireWeapon(30);

        bomb.fireWeapon();
        gun.fireWeapon();


    }
}
