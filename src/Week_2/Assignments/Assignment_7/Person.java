package Week_2.Assignments.Assignment_7;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Person implements PersonInterface, Comparable<Person> {

  private String firstName;
  private String lastName;
  public boolean running = false;
  int age;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() { return age; }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Person(Person person) {
    this.firstName = person.firstName;
    this.lastName = person.lastName;
    this.age = person.age;
  }

  public boolean equals(Object other){
    if(other == this){
      System.out.println("I am here in other == this");
      return true;
    }else if(other == null){
      System.out.println("I am here in other == null");
      return false;
    }else if(getClass() != other.getClass()){
      System.out.println("I am here in getClass() != other.getClass()");
      return false;
    }
    Person person = (Person)other;
    return (this.firstName == person.firstName && this.lastName == person.lastName);
  }

  @Override
  public String toString() {
    return "My class is " + getClass() + " " + this.firstName + " " + this.lastName + " " + this.age;
  }

  @Override
  public void walk() {
    System.out.println("I am walking");
    running = false;
  }

  @Override
  public void run() {
    System.out.println("I am running");
    running = true;
  }

  @Override
  public boolean isRunning() {
    return running;
  }


 // @Override
 // public int compareTo(Person p) {
 //  return (this.age - p.age);
 // }


  @Override
  public int compareTo(Person p) {
    int value = this.age - p.age;
    if(value == 0){
      return (this.lastName.compareTo(p.lastName) + this.firstName.compareTo(p.firstName));
    }else{
      return value;
    }
  }
}
