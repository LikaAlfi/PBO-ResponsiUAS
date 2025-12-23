/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author SYSTEM SSSD SATA
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();

        System.out.print("Masukkan nama anggota: ");
        String nama = input.nextLine();
        Anggota anggota = new Anggota(nama);
        perpus.tambahAnggota(anggota);

        Peminjaman pinjam = new Peminjaman(anggota);

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Lihat Buku Dipinjam");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> {
                    System.out.print("ID Buku: ");
                    String id = input.nextLine();
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();
                    perpus.tambahBuku(new Buku(id, judul, penulis));
                }
                case 2 -> perpus.tampilkanBuku();
                case 3 -> {
                    System.out.print("Masukkan ID Buku: ");
                    Buku b = perpus.cariBuku(input.nextLine());
                    if (b != null) pinjam.pinjamBuku(b);
                    else System.out.println("Buku tidak ditemukan");
                }
                case 4 -> {
                    System.out.print("Masukkan ID Buku: ");
                    Buku b = perpus.cariBuku(input.nextLine());
                    if (b != null) pinjam.kembalikanBuku(b);
                }
                case 5 -> pinjam.tampilkanPinjaman();
            }
        } while (pilih != 0);

        System.out.println("Terima kasih");
    }
}
