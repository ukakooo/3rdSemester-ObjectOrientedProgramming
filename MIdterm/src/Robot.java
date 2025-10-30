public class Robot {
    protected String Name;
    protected int CPUSpeed = 0, Power = 0;

    public void increasePower() {
        Power += 10;
    }

    public void reducePower() {
        Power -= 10;
    }
}