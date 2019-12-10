package Week3.Assignments.GenericClasses;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class MyNumberArray {

  public <E extends Number> void printArray(E[] inputArray){
    for(E element : inputArray){
      System.out.print(element + ", ");
    }
  }

  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray = {2.2,3.4,4.3,1.9,5.8};
    Float[] floatArray = {0.1F, 1.5F, 6.7F, 3.2F, 6.8F};
    MyNumberArray myNumberArray = new MyNumberArray();
    System.out.println("Printing the contents of intArray: ");
    myNumberArray.printArray(intArray);
    System.out.println("\n" + "Printing the contents of doubleArray: ");
    myNumberArray.printArray(doubleArray);
    System.out.println("\n" + "Printing the contents of floatArray: ");
    myNumberArray.printArray(floatArray);

  }
}
