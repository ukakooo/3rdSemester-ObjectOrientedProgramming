package Assignment;

public class College {
    private String name;
    private Course course;

    public College(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void assignCourse(Course course, Student student, Lecturer lecturer) {
        this.course = course;
        course.setStudent(student);
        course.setLecturer(lecturer);
    }

    public void info() {
        System.out.println("College Name: " + name);
        course.info();
    }
}
