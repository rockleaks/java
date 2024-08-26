class Student {
    int roll_no;
    String stu_name;

    Student(int i, String n) // Parameterized constructor
    {
        roll_no = i; // Instance Variable
        stu_name = n; // Instance Variable
    }

    void display() {
        System.out.println(roll_no + " " + stu_name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(1, "RAM");
        Student s2 = new Student(2, "SITA");
        s1.display();
        s2.display();
    }
}