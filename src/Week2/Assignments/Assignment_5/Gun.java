package Week2.Assignments.Assignment_5;

public class Gun extends Weapon {

    public void fireWeapon(int power){
        System.out.println("In Gun.fireWeapon() with a power of " + power);
    }

    @Override
    public void activate(boolean enable) {
        System.out.println("In the Gun.activate() with an enable of " + enable);
    }

    public void fireWeapon(){
        System.out.println("In overload Bomb.fireWeapon()");
        super.fireWeapon(42);
    }
}
