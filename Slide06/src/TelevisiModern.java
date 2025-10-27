public class TelevisiModern extends Televisi {
    protected String modusTampilan;
    protected String dvd;

    TelevisiModern(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
        channelAktif = 1;
        this.dvd = "kosong";
    }

    public void gantiModusTampilan(String modus) {
        this.modusTampilan = modus;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + this.dvd);
    }

    public void masukkanDVD(String judul) {
        this.dvd = judul;
    }
}
