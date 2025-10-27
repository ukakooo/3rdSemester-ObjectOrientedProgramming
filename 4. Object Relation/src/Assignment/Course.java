package Assignment;

public class Course {
    private String courseName;
    private String courseCode;
    private int credit;
    private Student student;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, int credit, Student student, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
        this.student = student;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void info() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit: " + credit);
        System.out.println("\nStudent Info:");
        student.info();
        System.out.println("\nLecturer Info:");
        lecturer.info();
    }
}
