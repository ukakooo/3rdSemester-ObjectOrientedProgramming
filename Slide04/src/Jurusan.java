public class Jurusan {
    private String nama, akreditasi;

    void setNama (String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setAkreditasi (String akreditasi) {
        this.akreditasi = akreditasi;
    }

    String getAkreditasi() {
        return akreditasi;
    }

    void tampilkanInfo() {
        System.out.println("Jurusan: " + nama);
        System.out.println("Akreditasi: " + akreditasi);
    }
}