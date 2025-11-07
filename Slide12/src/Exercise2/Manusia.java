package Exercise2;

public class Manusia {
    Electronics device = new Electronics();

    public void nyalakanPerangkat (Electronics device) {
        if (device instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul)device).getInputMode());
            System.out.println("Voltase televisi: " + device.getVoltage());
        } else if (device instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input: " + ((TelevisiModern)device).getInputMode());
            System.out.println("Voltase televisi: " + device.getVoltage());
        }
    }
}
