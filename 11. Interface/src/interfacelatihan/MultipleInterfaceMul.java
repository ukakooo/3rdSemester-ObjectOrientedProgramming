package interfacelatihan;

public class MultipleInterfaceMul {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        System.out.println("---------------------------------------------");
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}
