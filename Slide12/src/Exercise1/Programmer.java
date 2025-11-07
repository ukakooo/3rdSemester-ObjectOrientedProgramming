package Exercise1;

public class Programmer extends Pegawai {
    protected int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        // TODO Auto-generated method stub
        return this.gaji;
    }

    public int getBonus() {
        return bonus;
    }
}
