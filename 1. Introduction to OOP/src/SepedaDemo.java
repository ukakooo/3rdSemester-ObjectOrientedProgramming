public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda bike1 = new Sepeda();
        Sepeda bike2 = new Sepeda();
        SepedaGunung bike3 = new SepedaGunung();

        bike1.setBrand("Polygone");
        bike1.increaseSpeed(10);
        bike1.changeGear(2);
        bike1.printStatus();

        bike2.setBrand("Wiim Cycle");
        bike2.increaseSpeed(10);
        bike2.changeGear(2);
        bike2.increaseSpeed(10);
        bike2.changeGear(3);
        bike2.printStatus();

        bike3.setBrand("Klinee");
        bike3.increaseSpeed(5);
        bike3.changeGear(7);
        bike3.setSuspensionType("Gas Suspension");
        bike3.printStatus();
    }
}
