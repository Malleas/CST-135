package Week1.Assignment_1;


public class Person {


  public String fName;
  public String lName;
  private int age;
  private String phoneNumber;
  private String address;
  private double steps;

  public Person(String fName, String lName, int age, String phoneNumber, String address) {
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setSteps(int steps) {
    this.steps = steps;
  }

  public double walk(double steps) {
    return this.steps = (steps * 2.5);
  }

  public double run(double steps){
    return this.steps = (steps * 6);
  }


  public static void main(String[] args) {
    Person person = new Person("Matt", "Sievers", 37, "111-111-1122", "111 Hill St.");
    double walkDistance = person.walk(5);
    double runDistance = person.run(15);
    System.out.println(person.fName + " walked " + walkDistance + " ft. today and ran " + runDistance + " ft.");
    System.out.println(person.fName + "'s info " + "\n" + "Age: " + person.age + "\n" + "Phone Number: "
            + person.phoneNumber + "\n" + "Address: " + person.address);

  }
}
