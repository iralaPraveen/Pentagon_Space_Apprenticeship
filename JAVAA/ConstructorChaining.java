class Student {
    String name;
    String id;
    String branch;
    float marks;

    Student(String name) {
        this.name = name;

    }

    Student(String id, String name) {
        this(name);
        this.id = id;
    }

    Student(String id, String name, String branch) {
        this(id, name);
        this.branch = branch;
    }
    void display() {
        System.out.println(this.id + " " + this.name + " " + this.branch + " " + this.marks);
    }   

}
class ConstructorChaining {
    public static void main(String args[]) {
        Student s1 = new Student("21CST001", "Praveen", "CST");
        s1.marks = 89.5f;
        s1.display();
        Student s2 = new Student("Praveen");
        s2.display();
    }
}