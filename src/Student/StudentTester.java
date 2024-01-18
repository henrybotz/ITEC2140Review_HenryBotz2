package Student;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Alice", 22),
                new Student("Bob", 18),
                new Student("Charlie", 25),
                new Student("David", 19)
        };


        System.out.println("Names of students older than 20:");

        for (Student student : students) {
            if (student.getAge() > 20) {
                System.out.println(student.getName());
            }
        }
    }
}