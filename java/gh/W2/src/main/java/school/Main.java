package school;

import school.management.CourseManager;
import school.management.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();

        Student student1 = new Student("Alice", 20, 12345);
        student1.enrollCourses(new String[]{"Math", "Science"});
        student1.calculateTuition(); // Calculate tuition based on enrolled courses

        Student student2 = new Student("Bob", 22, 67890);
        student2.enrollCourses("History");
        student2.calculateTuition(); // Calculate tuition based on enrolled courses

        courseManager.addStudent(student1); // Add first student
        courseManager.addStudent(student2); // Add second student

        System.out.println("Displaying all students:");
        courseManager.displayAllStudents(); // Display all added students
    }
}
