/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author PC
 */

import java.util.ArrayList;
import java.sql.*;

public class Members {
    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Members() {

    }

    public Members(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public Members getById(int id) {
        Members ang = new Members();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota "
                + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                ang = new Members();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Members> getAll() {
        ArrayList<Members> ListMembers = new ArrayList<Members>();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Members ang = new Members();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

                ListMembers.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMembers;
    }

    public ArrayList<Members> search(String keyword) {
        ArrayList<Members> ListMembers = new ArrayList<Members>();

        String sql = "SELECT * FROM anggota "
                + " WHERE nama LIKE '%" + keyword + "%'"
                + " OR alamat LIKE '%" + keyword + "%'"
                + " OR telepon LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Members ang = new Members();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

                ListMembers.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMembers;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES('"
                    + this.nama + "', '"
                    + this.alamat + "', '"
                    + this.telepon + "')";
            this.idanggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE anggota SET nama='" + this.nama + "', alamat='" + this.alamat + "', telepon='" + this.telepon
                    + "' WHERE idanggota='" + this.idanggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper.executeQuery(SQL);
    }
}
