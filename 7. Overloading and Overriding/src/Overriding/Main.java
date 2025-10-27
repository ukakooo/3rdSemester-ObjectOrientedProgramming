package Overriding;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        manusia.bernafas();
        manusia.makan();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.makan();
        mahasiswa.tidur();

        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();
    }
}
