package Assignment;

public class Anggota {
    private String id, nama;
    private int pinjaman, limitPinjaman;

    public Anggota(String id, String nama, int limitPinjaman) {
        this.id = id;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPinjaman() {
        return pinjaman;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjam(int uang) {
        if (uang <= limitPinjaman) {
            pinjaman += uang;
        } else {
            System.out.println("Maaf. Jumlah pinjaman melebihi limit.");
        }
    }

    public void angsar(int uang) {
        int minimalPinjaman = pinjaman / 10;
        if (uang < minimalPinjaman) {
            System.out.println("Maaf, angsurah harus 10% dari jumlah pinjaman");
        } else {
            pinjaman -= uang;
        }
    }
}
