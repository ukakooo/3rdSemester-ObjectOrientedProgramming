package Assignment;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Mark", "1234");
        Lecturer l = new Lecturer("Dr. VSauce", "5678");
        Course c = new Course("Object Oriented Programming", "12345", 3, s, l);
        College col = new College("Polinema", c);

        col.assignCourse(c, s, l);
        col.info();
    }
}
