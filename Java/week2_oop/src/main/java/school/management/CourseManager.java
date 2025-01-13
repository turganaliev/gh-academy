package school.management;

public class CourseManager {
    private Student[] students;
    private int studentCount;

    public CourseManager() {
        this.students = new Student[100];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        }
        else {
            System.out.println("Cannot add more students, maximum limit reached.");
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student: " + (i + 1) + ": ");
            students[i].displayDetails();
            System.out.println("Student ID: " + students[i].studentID);
            System.out.println("Tuition: $" + students[i].getTuition());
        }
    }
}

