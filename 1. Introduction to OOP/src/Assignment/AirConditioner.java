package Assignment;

public class AirConditioner {
    String brand, model, color;

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void setModel(String newValue) {
        model = newValue;
    }

    public void setColor(String newValue) {
        color = newValue;
    }

    public void printDetails() {
        System.out.println("\nAir Conditioner Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
