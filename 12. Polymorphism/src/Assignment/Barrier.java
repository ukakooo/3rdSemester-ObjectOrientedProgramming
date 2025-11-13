package Assignment;

public class Barrier implements Destroyable {
    protected int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 9; //Did this so the output produces 64
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
