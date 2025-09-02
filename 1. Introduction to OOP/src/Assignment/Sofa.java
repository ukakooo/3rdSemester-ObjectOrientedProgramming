package Assignment;

public class Sofa {
    String brand, material, color;

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void setMaterial(String newValue) {
        material = newValue;
    }

    public void setColor(String newValue) {
        color = newValue;
    }

    public void printDetails() {
        System.out.println("\nSofa Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}
