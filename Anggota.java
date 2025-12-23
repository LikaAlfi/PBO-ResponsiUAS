/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author SYSTEM SSSD SATA
 */
import java.io.Serializable;

public class Anggota implements Serializable {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
