package Exercise1;

public class Manajer extends Pegawai {
    protected int tunjangan;
    
    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        // TODO Auto-generated method stub
        return this.gaji;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}
