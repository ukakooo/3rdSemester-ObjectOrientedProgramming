package SumPublicTransportation;

public class MainPercobaan4 {
    public static void main(String[] args) {
    Penumpang p = new Penumpang("1234", "Mr. Krab");
    Gerbong gerbong = new Gerbong("A", 10);
    gerbong.setPenumpang(p, 1);

    Penumpang p2 = new Penumpang("5678", "Budi");
    gerbong.setPenumpang(p2, 1);
    System.out.println(gerbong.info());
        
    }
}
