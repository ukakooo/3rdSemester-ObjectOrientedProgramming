public class Mahasiswa {
    private String nama, nim;
    Jurusan jur;

    Mahasiswa(String nama, String nim, Jurusan jur) {
        this.nama = nama;
        this.nim = nim;
        this.jur = jur;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return nama;
    }

    void setNim(String nim) {
        this.nim = nim;
    }

    String getNim() {
        return nim;
    }

    void setJurusan(Jurusan jur) {
        this.jur = jur;
    }

    Jurusan getJurusan() {
        return jur;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        jur.tampilkanInfo();
    }
}
