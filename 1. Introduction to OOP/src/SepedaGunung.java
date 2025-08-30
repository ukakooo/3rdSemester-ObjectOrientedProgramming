public class SepedaGunung extends Sepeda {
    private String suspensionType;

    public void setSuspensionType(String newValue) {
        suspensionType = newValue;
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Suspension Type: " + suspensionType);
    }
}
