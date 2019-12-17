package Week1.DailyQuestions;

/**
 * All work is created by Matt Sievers on 11-25-2019 for use in CST-105
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Write two Java classes that demonstrate the use of composition.
 * Write two Java classes that demonstrate the use of aggregation.
 * Explain why each of the examples you coded fits the definition of composition and aggregation.
 * <p>
 * Aggregation is shown as a "Has-A" relationship to other objects.  In this, the object has a relationship to another
 * object but can stand along by itself.  In the examples below, Employee can exist without Department.  Bob is still
 * an object regardless if department is set or not.
 * <p>
 * Composition is shown to have a relationship that is a "Part-Of".  In this, the object that is part of another object
 * can not stand by itself.  It has a direct relationship for existence based on another class.  In the example below,
 * students can not exist without a classroom existing as well.  Delete classroom and the students and their grades no
 * longer exist.
 * <p>
 * Association, Composition and Aggregation in Java (n.d.)  GeeksforGeeks.  Retrieved from:
 * https://www.geeksforgeeks.org/association-composition-aggregation-java/
 */
public class w1Dq1 {

  /**
   * Aggregation
   */

  static class Department {

    private String departmentName;

    public String getDepartmentName() {
      return departmentName;
    }

    public void setDepartmentName(String departmentName) {
      this.departmentName = departmentName;
    }

    public Department(String departmentName) {
      this.departmentName = departmentName;
    }
  }

  static class Employee {

    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Employee(String name) {
      this.name = name;
    }
  }

  static class Aggregation {
    public static void main(String[] args) {
      Department department = new Department("Shipping");
      Employee employee = new Employee("Bob");

      System.out.println(employee.getName() + " is an employee working in " + department.getDepartmentName() + " department.");

    }
  }

  /**
   * Composition
   */

  static class Student {
    private String name;
    private String grade;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getGrade() {
      return name;
    }

    public void setGrade(String grade) {
      this.grade = grade;
    }

    public Student(String name, String grade) {
      this.name = name;
      this.grade = grade;
    }
  }

  static class Classroom {
    private List<Student> students;

    Classroom(List<Student> students) {
      this.students = students;
    }

    public List<Student> getTotalStudents() {
      return students;
    }

  }

  static class Composition {
    public static void main(String[] args) {
      Student s1 = new Student("Jim", "B");
      Student s2 = new Student("Susan", "A");
      Student s3 = new Student("Mark", "F");

      List<Student> students = new ArrayList<Student>();
      students.add(s1);
      students.add(s2);
      students.add(s3);

      Classroom classroom = new Classroom(students);

      List<Student> totalStudents = classroom.getTotalStudents();
      for (Student s : totalStudents){
        System.out.println("Student Name " + s.name + " has a current grade of: " + s.grade);
      }
    }
  }

}
