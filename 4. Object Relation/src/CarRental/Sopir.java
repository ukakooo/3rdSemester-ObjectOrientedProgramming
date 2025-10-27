package CarRental;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {

    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    int getBiaya() {
        return biaya;
    }

    int hitungBiayaSopir (int hari) {
        return biaya * hari;
    }
}
