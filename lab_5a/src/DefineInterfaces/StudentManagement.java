package DefineInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement implements IStudentManagement {
    private Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(String studentId, String name) {
        if (!students.containsKey(studentId)) {
            students.put(studentId, new Student(studentId, name));
        } else {
            throw new IllegalArgumentException("Student ID already exists.");
        }
    }

    @Override
    public Student getStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        } else {
            throw new IllegalArgumentException("Student ID not found.");
        }
    }
}

 class CourseManagement implements ICourseManagement {
    private Map<String, Course> courses = new HashMap<>();

    @Override
    public void addCourse(String courseId, String courseName) {
        if (!courses.containsKey(courseId)) {
            courses.put(courseId, new Course(courseId, courseName));
        } else {
            throw new IllegalArgumentException("Course ID already exists.");
        }
    }

    @Override
    public Course getCourse(String courseId) {
        if (courses.containsKey(courseId)) {
            return courses.get(courseId);
        } else {
            throw new IllegalArgumentException("Course ID not found.");
        }
    }
}

 class EnrollmentManagement implements IEnrollmentManagement {
    private IStudentManagement studentManagement;
    private ICourseManagement courseManagement;

    public EnrollmentManagement(IStudentManagement studentManagement, ICourseManagement courseManagement) {
        this.studentManagement = studentManagement;
        this.courseManagement = courseManagement;
    }

    @Override
    public void enrollStudent(String studentId, String courseId) {
        Student student = studentManagement.getStudent(studentId);
        Course course = courseManagement.getCourse(courseId);
        student.enroll(course);
        course.addStudent(student);
    }

    @Override
    public List<Student> getStudentsInCourse(String courseId) {
        Course course = courseManagement.getCourse(courseId);
        return course.getEnrolledStudents();
    }
}

