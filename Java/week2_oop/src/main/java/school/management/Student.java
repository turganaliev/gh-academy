package school.management;

import school.Person;

public class Student extends Person {
    public int studentID;
    private String[] enrolledCourses;
    private double tuition;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
        this.enrolledCourses = new String[10];
    }

    public void enrollCourses(String[] courses) {
        this.enrolledCourses = courses;
    }

    public void enrollCourses(String course) {
        for (int i = 0; i < enrolledCourses.length; i++) {
            if (enrolledCourses[i] == null) {
                enrolledCourses[i] = course;
                break;
            }
        }
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public void calculateTuition() {
        int numberOfCourses = 0;
        for (String course : enrolledCourses) {
            if (course != null) {
                numberOfCourses++;
            }
        }
        this.tuition = numberOfCourses * 500;
    }
}
