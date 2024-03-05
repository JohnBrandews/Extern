public class University {
   //instance of the outer class
   private String universityname;
   private static int age;
   //constructor for the university class
   public University(String universityname, int age) {
    this.universityname = universityname;
    this.age = age;
   }
   //inner class representing a student
   class Student {
    //instance variables for the inner class
    private String studentName;
    private int studentId;
    //constructor for the student class
    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }
    //method to display information about the student
    public void displayStudentInfo() {
        System.out.println("University" + universityname);
        System.out.println("Student Name" + studentName);
        System.out.println("Student ID" + studentId);
        System.out.println("your age"+ age);
    }
}
//static nested class representing a department
static class Department{
    //static variable of the static nested class
    private static int departmentCount = 0;
    //instance variable of the static nested class
    private String departmentName;
    //constructor for the department class
    public Department(String departmentName) {
        this.departmentName = departmentName;
        departmentCount++;
    }
    //method to display information about the department
    public void displayDepartmentInfo() {
        System.out.println("Department name" + departmentName);
        System.out.println("total departments" + departmentCount);
    }
}
public static void main(String[] args) {
    //create instance of the university class
    University myUniversity = new University("chuka university", 20);
    //create an instance of the inner class using the outerclass instance
    University.Student student1 = myUniversity.new Student("john",101);
    student1.displayStudentInfo();
    //create an istance of the static nested class without an outer class instance
    University.Department department1 = new University.Department("computer science");
    department1.displayDepartmentInfo();
}
}
