package Week1.Assignment_1;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 11-25-2019 for use in CST-105
 */

/**
 * Car must have 1 engine, 4 tires
 * Engine must start and stop
 * Before engine starts, tires must be at 32psi
 * car must start, run random1-60 mph, stop and restart
 * <p>
 * Logic checks
 * <p>
 * if car tires >= 4 && PSI >= 32 engine can start
 * if car engine >= 1, car can start
 * <p>
 * if engine == off, start == true,
 * else if engine == on, start == false
 * <p>
 * stop() == mph(0)
 * <p>
 * if start == true, mph = random(1-60)
 *
 * Testing:
 * Check < 4 tires 1 engine = engine status false
 * Check 0 engines = engine status false
 * Check 4 tires = engine status true
 * Check > 4 tires = engine status true
 * Check 1 engine = engine status true
 * Check > 1 engine = engine status true
 * Check PSI >= 32 PSI and isCar == true = engineStatus true
 * Check PSI < 32 PSI and isCar == true = engineStatus false
 * check if engineStatus = true and stopEngine(), engineStatus should be false
 * Check if engineStatus = true, stopCar() = speed is 0
 */
public class RaceCar {

  public int tires;
  public int engine;
  public int tirePSI;
  public boolean engineStatus;
  public int speed;

  public RaceCar(int tires, int engine, int tirePSI) {
    this.tires = tires;
    this.engine = engine;
    this.tirePSI = tirePSI;
  }

  public int getTires() {
    return tires;
  }

  public void setTires(int tires) {
    this.tires = tires;
  }

  public int getEngine() {
    return engine;
  }

  public void setEngine(int engine) {
    this.engine = engine;
  }

  public int getTirePSI() {
    return tirePSI;
  }

  public void setTirePSI(int tirePSI) {
    this.tirePSI = tirePSI;
  }

  public boolean isEngineStatus() {
    return engineStatus;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setEngineStatus(boolean engineStatus) {
    this.engineStatus = engineStatus;
  }

  public boolean checkIfComplete(int tires, int engine){
    if(tires >= 4 & engine >= 1){
      return true;
    }
    return false;
  }

  public boolean checkTirePSI(int tirePSI) {
    if (tirePSI >= 32) {
      return true;
    }
    return false;
  }

  public boolean startEngine(boolean tireCheck, boolean isCar) {
    if (tireCheck == true & isCar == true & engineStatus == false) {
      return engineStatus = true;
    }
    return engineStatus = false;
  }

  public boolean stopEngine() {
    return engineStatus = false;
  }

  public int speed() {
    speed = 0;
    Random random = new Random();
    if (engineStatus == true) {
      return speed = random.nextInt(60);
    }
    return speed;
  }

  public int stopCar(int speed) {
    if (speed > 0) {
      setSpeed(0);
    }
    return speed;
  }


  public void goSpeedRacer(String raceCarName, int tires, int engine, int tirePSI){
    boolean isCar = checkIfComplete(tires, engine);
    boolean tirePSICheck = checkTirePSI(tirePSI);
    boolean engineCheck = startEngine(tirePSICheck, isCar);
    if(isCar == false & (tires < 4 && engine >= 1)){
      System.out.println(raceCarName +  " your car is not complete, " + tires
              + " tires are less then 4, Race Car requires at least 4 tires" + "\n"+ "Engine Status is: "
              + engineCheck + "\n");
    }
    else if(isCar == false & (engine < 1 && tires >= 4)){
      System.out.println(raceCarName + " your car is not complete, " + engine
              + " engines are less then 1, Race Car requires at least 1 engine"+ "\n" + "Engine Status is: "
              + engineCheck + "\n");
    }
    else if(tirePSICheck == false){
      System.out.println(raceCarName +  " your car tires are not properly inflated, " + tirePSI
              + " is less then 32, Race Car requires tires to be inflated to 32 PSI" + "\n"+ "Engine Status is: "
              + engineCheck + "\n");
    }
    else {
      System.out.println("Race Car Name: " + raceCarName + "\n" +"Is car complete? " + isCar + "\n"
              + "Tire Pressure Check was: " + tirePSICheck + "\n" + "Engine Status is: " + engineCheck + "\n"
              + "Current Speed: " + speed() + "\n");
    }


  }

  public static void main(String[] args) {
    //test 1
    RaceCar raceCar1 = new RaceCar(3, 1, 33);
    RaceCar raceCar2 = new RaceCar(4, 0, 33);
    RaceCar raceCar3 = new RaceCar(4, 1, 33);
    RaceCar raceCar4 = new RaceCar(8, 1, 33);
    RaceCar raceCar5 = new RaceCar(4, 13, 33);
    RaceCar raceCar6 = new RaceCar(4, 13, 28);
    raceCar1.goSpeedRacer("Race Car 1", raceCar1.getTires(), raceCar1.getEngine(), raceCar1.getTirePSI());
    raceCar2.goSpeedRacer("Race Car 2", raceCar2.getTires(), raceCar2.getEngine(), raceCar2.getTirePSI());
    raceCar3.goSpeedRacer("Race Car 3", raceCar3.getTires(), raceCar3.getEngine(), raceCar3.getTirePSI());
    raceCar4.goSpeedRacer("Race Car 4", raceCar4.getTires(), raceCar4.getEngine(), raceCar4.getTirePSI());
    raceCar5.goSpeedRacer("Race Car 5", raceCar5.getTires(), raceCar5.getEngine(), raceCar5.getTirePSI());
    raceCar5.goSpeedRacer("Race Car 6", raceCar6.getTires(), raceCar6.getEngine(), raceCar6.getTirePSI());

    System.out.println("Race Car 3's current speed is: " + raceCar3.getSpeed());
    System.out.println("Stopping Race Car 3");
    raceCar3.stopCar(raceCar3.getSpeed());
    System.out.println("Race Car 3's current speed is: " + raceCar3.getSpeed() + "\n");
    System.out.println("Race Car 3's Engine status is: " + raceCar3.engineStatus);
    System.out.println("Turning engine of Race Car 3 off");
    raceCar3.stopEngine();
    System.out.println("Race Car 3's Engine status is: " + raceCar3.engineStatus);
    System.out.println("Restarting Race Car 3's engine");
    boolean isCar = raceCar3.checkIfComplete(raceCar3.getTires(), raceCar3.getEngine());
    boolean checkTirePSI = raceCar3.checkTirePSI(raceCar3.getTirePSI());
    boolean raceCar3Status = raceCar3.startEngine(isCar, checkTirePSI);
    System.out.println("Race Car 3 Engine Status is: " + raceCar3Status);





  }
}
