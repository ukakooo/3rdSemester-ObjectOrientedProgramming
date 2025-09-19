package SumPublicTransportation;

public class Penumpang {
    private String ktp, nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    void setKTP (String ktp) {
        this.ktp = ktp;
    }

    String getKTP () {
        return ktp;
    }

    void setNama (String nama) {
        this.nama = nama;
    }

    String getNama () {
        return nama;
    }

    String info() {
        String info = "";
        info += "KTP: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
