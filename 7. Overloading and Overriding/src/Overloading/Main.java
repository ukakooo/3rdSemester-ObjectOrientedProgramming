package Overloading;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.totalSudut(1));
        System.out.println(triangle.totalSudut(1, 2));
        System.out.println(triangle.keliling(1, 2, 3));
        System.out.printf("%.2f\n", triangle.keliling(1, 2));
    }
}
