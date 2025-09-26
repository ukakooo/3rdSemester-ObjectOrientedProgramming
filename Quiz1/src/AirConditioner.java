public class AirConditioner {
    private String brand;
    private int productionYear;
    private Compressor mainCompressor;
    private Remote mainRemote;

    public AirConditioner (String brand, int productionYear, Compressor mainCompressor, Remote mainRemote) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.mainCompressor = mainCompressor;
        this.mainRemote = mainRemote;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Compressor getMainCompressor() {
        return mainCompressor;
    }

    public void setMainCompressor(Compressor mainCompressor) {
        this.mainCompressor = mainCompressor;
    }

    public Remote getMainRemote() {
        return mainRemote;
    }

    public void setMainRemote(Remote mainRemote) {
        this.mainRemote = mainRemote;
    }
}
