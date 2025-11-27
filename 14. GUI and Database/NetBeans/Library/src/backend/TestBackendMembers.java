/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author PC
 */

import backend.*;

public class TestBackendMembers {
    public static void main(String[] args) {
        Members mem1 = new Members("Spinosaurus Aegyptiacus", "North Africa", "1234567890");
        Members mem2 = new Members("Giganotosaurus Carolinii", "Argentina", "0987654321");
        Members mem3 = new Members("Tyrannosaurus Rex", "North America", "1122334455");

        mem1.save();
        mem2.save();
        mem3.save();
        
        for(Members m : new Members().getAll()) {
            System.out.println("Nama: " + m.getNama() + ", Ket: " + m.getAlamat() + ", Telp: " + m.getTelepon());
        }
    }
}
