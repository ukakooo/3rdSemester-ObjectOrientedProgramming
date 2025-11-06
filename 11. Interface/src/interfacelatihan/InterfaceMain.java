package interfacelatihan;

import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakrektor.bersertifikatCumlaude(mhsBiasa);
        pakrektor.bersertifikatCumlaude(sarjanaCumlaude);
        pakrektor.bersertifikatCumlaude(masterCumlaude);
    }
}
