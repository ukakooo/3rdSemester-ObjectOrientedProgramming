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

public class Book {

    private int idbook;
    private Category category = new Category();
    private String title;
    private String publisher;
    private String author;

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(Category category, String title, String publisher, String author) {
        this.category = category;
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public Book getById(int id) {
        Book book = new Book();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, "
                + "b.penulis AS penulis, "
                + "k.idkategori AS idkategori, "
                + "k.nama AS nama, "
                + "k.keterangan AS keterangan "
                + "FROM buku b "
                + "LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                book = new Book();
                book.setIdbook(rs.getInt("idbuku"));
                book.getCategory().setIdcategory(rs.getInt("idkategori"));
                book.getCategory().setNama(rs.getString("nama"));
                book.getCategory().setKeterangan(rs.getString("keterangan"));
                book.setTitle(rs.getString("judul"));
                book.setPublisher(rs.getString("penerbit"));
                book.setAuthor(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    public ArrayList<Book> getAll() {
        ArrayList<Book> ListBook = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, "
                + "b.penulis AS penulis, "
                + "k.idkategori AS idkategori, "
                + "k.nama AS nama, "
                + "k.keterangan AS keterangan "
                + "FROM buku b "
                + "LEFT JOIN kategori k ON b.idkategori = k.idkategori");

        try {
            while (rs.next()) {
                Book book = new Book();
                book.setIdbook(rs.getInt("idbuku"));
                book.getCategory().setIdcategory(rs.getInt("idkategori"));
                book.getCategory().setNama(rs.getString("nama"));
                book.getCategory().setKeterangan(rs.getString("keterangan"));
                book.setTitle(rs.getString("judul"));
                book.setPublisher(rs.getString("penerbit"));
                book.setAuthor(rs.getString("penulis"));
                
                ListBook.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBook;
    }

    public ArrayList<Book> search(String keyword) {
        ArrayList<Book> ListBook = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, "
                + "b.penulis AS penulis, "
                + "k.idkategori AS idkategori, "
                + "k.nama AS nama, "
                + "k.keterangan AS keterangan "
                + "FROM buku b "
                + "LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%' "
                + "OR b.penerbit LIKE '%" + keyword + "%' "
                + "OR b.penulis LIKE '%" + keyword + "%'");

        try {
            while (rs.next()) {
                Book book = new Book();
                book.setIdbook(rs.getInt("idbuku"));
                book.getCategory().setIdcategory(rs.getInt("idkategori"));
                book.getCategory().setNama(rs.getString("nama"));
                book.getCategory().setKeterangan(rs.getString("keterangan"));
                book.setTitle(rs.getString("judul"));
                book.setPublisher(rs.getString("penerbit"));
                book.setAuthor(rs.getString("penulis"));
                
                ListBook.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBook;
    }

    public void save() {
        if (getById(idbook).getIdbook() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "'" + this.title + "', "
                    + "'" + this.category.getIdcategory() + "', "
                    + "'" + this.author + "', "
                    + "'" + this.publisher + "')";
            this.idbook = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                    + "judul = '" + this.title + "', "
                    + "idkategori = '" + this.category.getIdcategory() + "', "
                    + "penulis = '" + this.author + "', "
                    + "penerbit = '" + this.publisher + "' "
                    + "WHERE idbuku = '" + this.idbook + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbook + "'";
        DBHelper.executeQuery(SQL);
    }
}
