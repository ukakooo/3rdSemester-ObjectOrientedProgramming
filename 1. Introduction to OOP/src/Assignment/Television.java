package Assignment;

public class Television {
    String brand, pixel, color;

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void setPixel(String newValue) {
        pixel = newValue;
    }

    public void setColor(String newValue) {
        color = newValue;
    }

    public void printDetails() {
        System.out.println("\nTelevision Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Pixel: " + pixel);
        System.out.println("Color: " + color);
    }
}
