package DefineInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IStudentManagement studentManagement = new StudentManagement();
        ICourseManagement courseManagement = new CourseManagement();
        IEnrollmentManagement enrollmentManagement = new EnrollmentManagement(studentManagement, courseManagement);

        studentManagement.addStudent("S1", "Alice");
        studentManagement.addStudent("S2", "Bob");

        courseManagement.addCourse("C1", "Math");
        courseManagement.addCourse("C2", "Science");

        enrollmentManagement.enrollStudent("S1", "C1");
        enrollmentManagement.enrollStudent("S2", "C1");

        List<Student> studentsInMath = enrollmentManagement.getStudentsInCourse("C1");
        for (Student student : studentsInMath) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }
}
