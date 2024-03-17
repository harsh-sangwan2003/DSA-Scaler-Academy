public class Student {

    String name;
    int age;

    // default constructor
    public Student() {

    }

    // parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 23;

        Student s2 = new Student("Harsh", 21);
        Student s3 = new Student(s2);
        System.out.println(s3.name);
        System.out.println(s3.age);
    }
}