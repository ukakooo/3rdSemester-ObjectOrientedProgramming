package Train;

public class KeretaApi {
    private String nama, kelas;
    private Pegawai masinis, asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setKelas(String kelas) {
        this.kelas = kelas;
    }

    String getKelas() {
        return kelas;
    }

    void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    Pegawai getMasinis() {
        return masinis;
    }

    void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    Pegawai getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama Kereta Api: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: \n" + this.masinis.info();
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        }
        return info;
    }
}
