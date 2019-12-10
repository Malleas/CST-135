package Week3.Assignments.GenericClasses;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class Storage <T> {

  private T s = null;


  public Storage(T s) {
    this.s = s;
  }

  public T getData(){
    return this.s;
  }

  public static void main(String[] args) {

    Storage<String> storageString = new Storage<String>("This is a String");
    System.out.println("this is the data for storageString: " + storageString.getData());
    Storage<Integer> storageInt = new Storage<>(15);
    System.out.println("This is the data for storageInt: " + storageInt.getData());

  }
}
