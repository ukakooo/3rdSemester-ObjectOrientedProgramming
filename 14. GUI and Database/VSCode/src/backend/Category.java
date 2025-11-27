package backend;

import java.util.ArrayList;
import java.sql.*;

public class Category {
    private int idcategory;
    private String nama;
    private String keterangan;

    public Category() {

    }

    public Category(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public Category getById(int id) {
        Category kat = new Category();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori "
                + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Category();
                kat.setIdcategory(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Category> getAll() {
        ArrayList<Category> ListKategori = new ArrayList<Category>();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Category kat = new Category();
                kat.setIdcategory(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Category> search(String keyword) {
        ArrayList<Category> ListKategori = new ArrayList<Category>();

        String sql = "SELECT * FROM kategori "
                + " WHERE nama LIKE '%" + keyword + "%'"
                + " OR keterangan LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Category kat = new Category();
                kat.setIdcategory(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(idcategory).getIdcategory() == 0) {
            String SQL = "INSERT INTO kategori(nama, keterangan) VALUES('"
                    + this.nama + "', '"
                    + this.keterangan + "')";
            this.idcategory = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kategori SET nama='" + this.nama + "', keterangan='" + this.keterangan
                    + "' WHERE idkategori='" + this.idcategory + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idcategory + "'";
        DBHelper.executeQuery(SQL);
    }
}
