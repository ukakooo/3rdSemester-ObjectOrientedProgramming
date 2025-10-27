package Overloading;

public class Triangle {
    private int sudut;

    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        int c = (sisiA * sisiA) + (sisiB * sisiB);
        return Math.sqrt(c);
    }
}
