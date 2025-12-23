/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author SYSTEM SSSD SATA
 */
public class Buku extends Koleksi {
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    @Override
    public void tampilInfo() {
        System.out.println(id + " | " + judul + " | " + penulis);
    }
}
