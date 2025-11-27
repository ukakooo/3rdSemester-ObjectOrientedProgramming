package backend;

import backend.*;

public class TestBackend {
    public static void main(String[] args) {
        Category kat1 = new Category("Novel", "Koleksi buku novel");
        Category kat2 = new Category("Referensi", "Buku referensi ilmiah");
        Category kat3 = new Category("Komik", "Komik anak-anak");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();

        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        // test delete
        kat3.delete();

        // test select all
        for(Category k : new Category().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        // test search
        for(Category k : new Category().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}