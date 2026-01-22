class Human {
    String name;
    int age;
    String gender;

    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }

}
class Student extends Human {
    String id;
    String branch;
    float marks;

    Student(String name, int age, String gender, String id, String branch,int marks) {
        super(name, age, gender);
        this.id = id;
        this.branch = branch;
        this.marks = marks;

    }   
    void displayStudent() {
        super.display();
        System.out.println("ID: " + this.id + ", Branch: " + this.branch + ", Marks: " + this.marks);
    }
}

class Employee extends Human {
    String empId;
    String department;
    float salary;

    Employee(String name, int age, String gender, String empId) {
        super(name, age, gender);
        this.empId = empId;
    }

    void displayEmployee() {
        super.display();
        System.out.println(
                "Employee ID: " + this.empId + ", Department: " + this.department + ", Salary: " + this.salary);
    }
    
    public static void main(String args[]) {
        Student s = new Student("Praveen", 20, "Male", "21CST54", "CST", 89);
        s.displayStudent();
    }


    
}
