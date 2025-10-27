package SumPublicTransportation;

public class Gerbong {
    String kode;
    Kursi[] arrayKursi = new Kursi[10];
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    void setKode(String kode) {
        this.kode = kode;
    }

    String getKode() {
        return kode;
    }

    void setPenumpang(Penumpang penumpang, int nomor) {
        if (arrayKursi[nomor - 1].getPenumpang() == null) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        } else {
            System.out.println("There's already someone here, " + penumpang.getNama() + ". Pick another seat.");
        }
    }

    String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
