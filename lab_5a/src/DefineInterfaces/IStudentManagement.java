package DefineInterfaces;

import java.util.List;

public interface IStudentManagement {
 void addStudent(String studentId, String name);
 Student getStudent(String studentId);
}

 interface ICourseManagement {
 void addCourse(String courseId, String courseName);
 Course getCourse(String courseId);
}

 interface IEnrollmentManagement {
 void enrollStudent(String studentId, String courseId);
 List<Student> getStudentsInCourse(String courseId);
}
