package Assignment;

public class LivingRoomAC extends AirConditioner {
    private String remoteBrand, batteryBrand;

    public void setRemoteBrand(String newValue) {
        remoteBrand = newValue;
    }

    public void setBatteryBrand(String newValue) {
        batteryBrand = newValue;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Remote Brand: " + remoteBrand);
        System.out.println("Battery Brand: " + batteryBrand);
    }
}
