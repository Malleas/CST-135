package Week3.Assignments.GenericClasses;

        import java.lang.reflect.Array;

/**
 * All work is created by Matt Sievers on 12-09-2019 for use in CST-105
 */
public class MyArray {

  public <E> void printArray(E[] inputArray){
    for(E element : inputArray){
      System.out.print(element + ", ");
    }
  }

  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray = {2.2,3.4,4.3,1.9,5.8};
    Character[] charArray = {'M','A','T','T'};
    MyArray myArray = new MyArray();
    System.out.println("Printing the contents of intArray: ");
    myArray.printArray(intArray);
    System.out.println("\n" + "Printing the contents of doubleArray: ");
    myArray.printArray(doubleArray);
    System.out.println("\n" + "Printing the contents of chatArray: ");
    myArray.printArray(charArray);

  }
}
