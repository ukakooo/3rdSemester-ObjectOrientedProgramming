package SumPublicTransportation;

public class Kursi {
    String nomor;
    Penumpang penumpang;

    public Kursi(String nomor) {
        this.nomor = nomor;
    }

    void setNomor(String nomor) {
        this.nomor = nomor;
    }

    String getNomor() {
        return nomor;
    }

    void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    Penumpang getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor Kursi: " + this.nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: \n" + this.penumpang.info() + "\n";
        }
        return info;
    }
}
