package CarRental;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {

    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    Mobil getMobil() {
        return mobil;
    }

    void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    Sopir getSopir() {
        return sopir;
    }

    void setHari(int hari) {
        this.hari = hari;
    }

    int getHari() {
        return hari;
    }

    int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
