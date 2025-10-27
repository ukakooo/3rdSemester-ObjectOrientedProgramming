package Assignment;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        // Anggota donny = new Anggota("111333444", "Donny", 5000000);

        // System.out.println("Nama Anggota: " + donny.getNama());
        // System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        // System.out.println("\nMeminjam uang 10.000.000...");
        // donny.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 1.000.000");
        // donny.angsar(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsar(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        //Scanner
        Scanner sigmaSkibidi = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = sigmaSkibidi.nextLine();
        System.out.print("Input nama: ");
        String nama = sigmaSkibidi.nextLine();
        System.out.print("Input limit pinjaman: ");
        int limitPinjaman = sigmaSkibidi.nextInt();
        Anggota donny = new Anggota(id, nama, limitPinjaman);

        while (true) {
            System.out.println("\nKoperasi legal (trust)");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sigmaSkibidi.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Input jumlah pinjaman: ");
                    int uang = sigmaSkibidi.nextInt();
                    donny.pinjam(uang);
                    break;
                case 2:
                    System.out.print("Input jumlah angsuran: ");
                    uang = sigmaSkibidi.nextInt();
                    donny.angsar(uang);
                    break;
                case 3:
                    System.out.println("Nama Anggota: " + donny.getNama());
                    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
                    System.out.println("Jumlah Pinjaman: " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    System.out.println("Jangan lupa bayar angsuran...");
                    return;
            }
        }

    }
}
