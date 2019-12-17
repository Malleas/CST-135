package Week4.Assignment.Assignment2;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", odometer=" + odometer +
                ", engineLiters=" + engineLiters +
                '}';
    }

    private int year;
    private String make;
    private String model;
    private int odometer;
    private double engineLiters;

    public Car(int year, String make, String model, int odometer, double engineLiters) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.engineLiters = engineLiters;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getEngineLiters() {
        return engineLiters;
    }

    public void setEngineLiters(double engineLiters) {
        this.engineLiters = engineLiters;
    }
}
