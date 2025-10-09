package Assignment;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(2);
        

        Dosen d1 = new Dosen("123", "Snock", "Sorna", 10, 120000);
        Dosen d2 = new Dosen("234", "Zeb", "BioSyn", 8, 320000);

        daftarGaji.addPegawai(d1);
        daftarGaji.addPegawai(d2);
        daftarGaji.printSemuaGaji();
    }
}
