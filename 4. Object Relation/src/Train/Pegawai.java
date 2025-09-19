package Train;

public class Pegawai {
    private String nip, nama;

    public Pegawai (String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    void setNIP(String nip){
        this.nip = nip;
    }

    String getNIP(){
        return nip;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return nama;
    }

    String info() {
        String info = "";
        info += "NIP: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
