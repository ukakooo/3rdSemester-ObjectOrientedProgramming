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

public class Borrowing {

    private int idpeminjaman;
    private Members member = new Members();
    private Book book = new Book();
    private String borrowdate;
    private String returndate;

    public Borrowing() {

    }

    public Borrowing(Members member, Book book, String borrowdate, String returndate) {
        this.member = member;
        this.book = book;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowDate() {
        return borrowdate;
    }

    public void setBorrowDate(String borrowdate) {
        this.borrowdate = borrowdate;
    }

    public String getReturnDate() {
        return returndate;
    }

    public void setReturnDate(String returndate) {
        this.returndate = returndate;
    }

    public Borrowing getById(int id) {
        Borrowing borrowing = new Borrowing();
        String query = "SELECT p.idpeminjaman, p.tanggalpinjam, p.tanggalkembali, "
                + "p.idanggota, p.idbuku, "
                + "a.idanggota, a.nama AS nama_anggota, a.alamat, a.telepon, "
                + "b.idbuku, b.judul, b.penerbit, b.penulis, b.idkategori "
                + "FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "WHERE p.idpeminjaman = '" + id + "'";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                borrowing = new Borrowing();
                borrowing.setIdpeminjaman(rs.getInt("idpeminjaman"));
                borrowing.setBorrowDate(rs.getString("tanggalpinjam"));
                borrowing.setReturnDate(rs.getString("tanggalkembali"));
                borrowing.getMember().setIdanggota(rs.getInt("idanggota"));
                borrowing.getBook().setIdbook(rs.getInt("idbuku"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return borrowing;
    }

    public ArrayList<Borrowing> getAll() {
        ArrayList<Borrowing> ListBorrowing = new ArrayList<>();
        String query = "SELECT p.idpeminjaman, p.tanggalpinjam, p.tanggalkembali, "
                + "p.idanggota, p.idbuku, "
                + "a.idanggota, a.nama AS nama_anggota, a.alamat, a.telepon, "
                + "b.idbuku, b.judul, b.penerbit, b.penulis "
                + "FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Borrowing borrowing = new Borrowing();
                borrowing.setIdpeminjaman(rs.getInt("idpeminjaman"));
                borrowing.setBorrowDate(rs.getString("tanggalpinjam"));
                borrowing.setReturnDate(rs.getString("tanggalkembali"));
                borrowing.getMember().setIdanggota(rs.getInt("idanggota"));
                borrowing.getBook().setIdbook(rs.getInt("idbuku"));

                ListBorrowing.add(borrowing);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBorrowing;
    }

    public ArrayList<Borrowing> search(String keyword) {
        ArrayList<Borrowing> ListBorrowing = new ArrayList<>();
        String query = "SELECT p.idpeminjaman, p.tanggalpinjam, p.tanggalkembali, "
                + "p.idanggota, p.idbuku, "
                + "a.idanggota, a.nama AS nama_anggota, a.alamat, a.telepon, "
                + "b.idbuku, b.judul, b.penerbit, b.penulis "
                + "FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "WHERE a.nama LIKE '%" + keyword + "%' "
                + "OR b.judul LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Borrowing borrowing = new Borrowing();
                borrowing.setIdpeminjaman(rs.getInt("idpeminjaman"));
                borrowing.setBorrowDate(rs.getString("tanggalpinjam"));
                borrowing.setReturnDate(rs.getString("tanggalkembali"));
                borrowing.getMember().setIdanggota(rs.getInt("idanggota"));
                borrowing.getBook().setIdbook(rs.getInt("idbuku"));

                ListBorrowing.add(borrowing);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBorrowing;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "'" + this.member.getIdanggota() + "', "
                    + "'" + this.book.getIdbook() + "', "
                    + "'" + this.borrowdate + "', "
                    + "'" + this.returndate + "')";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.member.getIdanggota() + "', "
                    + "idbuku = '" + this.book.getIdbook() + "', "
                    + "tanggalpinjam = '" + this.borrowdate + "', "
                    + "tanggalkembali = '" + this.returndate + "' "
                    + "WHERE idpeminjaman = '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}