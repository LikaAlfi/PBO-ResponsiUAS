/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author SYSTEM SSSD SATA
 */
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {

    private List<Buku> daftarBuku = new ArrayList<>();
    private List<Anggota> anggota = new ArrayList<>();

    public Perpustakaan() {
        List<Buku> data = FileManager.loadBuku();
        if (data != null) {
            daftarBuku = data;
        }
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        FileManager.simpanBuku(daftarBuku);
    }

    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku");
        } else {
            for (Buku b : daftarBuku) {
                b.tampilInfo();
            }
        }
    }

    public Buku cariBuku(String id) {
        for (Buku b : daftarBuku) {
            if (b.id.equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void tambahAnggota(Anggota a) {
        anggota.add(a);
    }
}
