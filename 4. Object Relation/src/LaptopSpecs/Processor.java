package LaptopSpecs;

public class Processor {
    private String merk;
    private double cache;

    public Processor() {

    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    void setMerk(String merk) {
        this.merk = merk;
    }
    
    String getMerk() {
        return merk;
    }

    void setCache(double cache) {
        this.cache = cache;
    }

    double getCache() {
        return cache;
    }

    void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

    
}