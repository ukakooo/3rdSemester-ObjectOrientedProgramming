package Assignment;

public class InterfaceMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");

        keledai.displayData();
        gorilla.displayData();
        singa.displayData();
    }
}
