package Assignment;

public class Lecturer {
    private String name;
    private String lecturerId;

    public Lecturer(String name, String lecturerId) {
        this.name = name;
        this.lecturerId = lecturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public void info() {
        System.out.println("Lecturer Name: " + name);
        System.out.println("Lecturer ID: " + lecturerId);
    }
}
