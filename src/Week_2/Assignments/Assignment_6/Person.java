package Week_2.Assignments.Assignment_6;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Person {

  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Person(Person person) {
    this.firstName = person.firstName;
    this.lastName = person.lastName;
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
    return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
  }
}
