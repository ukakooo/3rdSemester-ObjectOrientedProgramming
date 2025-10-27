package CarRental;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {

    }

    void setmerk(String merk) {
        this.merk = merk;
    }

    String getmerk() {
        return merk;
    }

    void setbiaya(int biaya) {
        this.biaya = biaya;
    }

    int getbiaya() {
        return biaya;
    }

    int hitungBiayaMobil (int hari) {
        return biaya * hari;
    }
}
