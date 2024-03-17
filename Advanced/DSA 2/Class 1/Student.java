public class Student {

    String name;
    int age;
    String batch;

    void changeBatch(String batch) {
        this.batch = batch;
    }

    void mockInterview() {
        System.out.println("Giving mock interview.");
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Harsh";
        s1.age = 21;
        s1.batch = "CSE2";

        System.out.println(s1);
    }
}