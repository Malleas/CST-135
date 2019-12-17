package Week4.Assignment.Assignment2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoWritingToFile {

    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\xxxfa\\Dropbox\\GCU Work\\CST-135\\src\\Week4\\Assignment\\Assignment2\\carsOut.txt";
        Car [] cars = new Car[5];
        cars[0] = new Car(2015, "Ford", "Focus", 60000, 3.2);
        cars[1] = new Car(1982, "Chevrolet", "Silverado", 160283, 6.8);
        cars[2] = new Car(1994, "Pontiac", "GrandAm", 250324, 1.5);
        cars[3] = new Car(2019, "Nissan", "Rouge", 11002, 4.5);
        cars[4] = new Car(2020, "Toyota", "Tacoma", 50, 7.2);

        for (int i = 0; i<cars.length; i++){
            String someText = Integer.toString(cars[i].getYear()) + "," + cars[i].getMake() + "," + cars[i].getModel()
            + "," + cars[i].getOdometer() + "," + Double.toString(cars[i].getEngineLiters());
            saveToFile(fileLocation, someText, true);
        }

        ArrayList<Car> carsReadFromFile = new ArrayList<>();
        carsReadFromFile = readCarsFromFile(fileLocation);

        System.out.println(carsReadFromFile.toString());

    }

    public static void saveToFile(String file, String text, boolean append) throws IOException {
            File f = new File(file);
            FileWriter fw = new FileWriter(f, append);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(text);
            pw.close();
    }

    public static ArrayList<Car> readFromFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        ArrayList<Car> cars = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] items = new String[5];
            items = line.split(",");
            int year = Integer.valueOf(items[0]);
            String make = items[1];
            String model = items[2];
            int odometer = Integer.valueOf(items[3]);
            double engineLiters = Double.valueOf(items[4]);

            Car c = new Car(year, make, model, odometer, engineLiters);
            cars.add(c);
        }
        return cars;
    }

    public static ArrayList<Car> readCarsFromFile(String fileName)throws FileNotFoundException{
        File f = new File(fileName);
        Scanner scanner = new Scanner(f);

        ArrayList<Car> carList = new ArrayList<>();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();

            String[] items = line.split(",");
            System.out.println(items[0]);
            System.out.println(items[1]);
            System.out.println(items[2]);
            System.out.println(items[3]);
            System.out.println(items[4]);

            int year = Integer.parseInt(items[0]);
            String make = items[1];
            String model = items[2];
            int odometer = Integer.parseInt(items[3]);
            double engineLiter = Double.parseDouble(items[4]);

            Car newCar = new Car(year, make, model, odometer, engineLiter);
            carList.add(newCar);
        }
        return carList;
    }
}
