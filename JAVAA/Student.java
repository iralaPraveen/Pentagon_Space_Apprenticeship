class Details {
    int rollno;
    String name;
    String branch;

    Details(int rollno, String name, String branch) {
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
    }

    void display() {
        System.out.println(this.rollno + " " + this.name + " " + this.branch);
    }

}



class Student {
    public static void main(String a[]) {
        Details d = new Details(45, "Praveen", "CST");
        d.display();
    }
     

    
}
