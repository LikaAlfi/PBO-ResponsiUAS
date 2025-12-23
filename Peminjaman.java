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
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements LayananPeminjaman, Serializable {

    private Anggota anggota;
    private List<Buku> bukuDipinjam = new ArrayList<>();

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
    }

    @Override
    public void pinjamBuku(Buku buku) {
        bukuDipinjam.add(buku);
        System.out.println("Buku berhasil dipinjam");
    }

    @Override
    public void kembalikanBuku(Buku buku) {
        bukuDipinjam.remove(buku);
        System.out.println("Buku berhasil dikembalikan");
    }

    public void tampilkanPinjaman() {
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Belum meminjam buku");
        } else {
            for (Buku b : bukuDipinjam) {
                b.tampilInfo();
            }
        }
    }
}