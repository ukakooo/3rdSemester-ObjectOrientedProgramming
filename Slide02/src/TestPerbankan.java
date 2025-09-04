public class TestPerbankan {
    public static void main(String[] args) {
        Nasabah nsb = new Nasabah();

        nsb.nama = "Bill Gates";
        nsb.saldo = 1000;

        nsb.tampilkanSaldo("IDR ");
    }
}
