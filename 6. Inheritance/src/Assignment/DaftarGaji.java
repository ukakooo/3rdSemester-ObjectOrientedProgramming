package Assignment;

public class DaftarGaji {
    protected Pegawai[] listPegawai;
    protected int pegawaiCounter = 0;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pegawai) {
        listPegawai[pegawaiCounter] = pegawai;
        pegawaiCounter++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < pegawaiCounter; i++) {
            System.out.println(listPegawai[i].getNama() + ": Rp. " + listPegawai[i].getGaji());
        }
    }
}
