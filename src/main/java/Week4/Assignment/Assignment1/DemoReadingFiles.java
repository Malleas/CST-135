package Week4.Assignment.Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoReadingFiles {

    public static void main(String[] args) throws FileNotFoundException {
       // File file = new File("C:\\Users\\xxxfa\\Dropbox\\GCU Work\\CST-135\\src\\Week4\\Assignment\\in.txt");
        File file = new File("C:\\Users\\xxxfa\\Dropbox\\GCU Work\\CST-135\\src\\Week4\\Assignment\\in1.txt");
        Scanner scanner = new Scanner(file);
      //  System.out.println(scanner.next());
      //  System.out.println(scanner.next());
      //  System.out.println(scanner.next());
      //  System.out.println(scanner.next());

       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();

       System.out.println(num1 + " + " + num2 + " = " +(num1+num2));

    }
}
