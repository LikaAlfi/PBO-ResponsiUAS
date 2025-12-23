/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author SYSTEM SSSD SATA
 */
import java.io.*;
import java.util.List;

public class FileManager {

    private static final String FILE_BUKU = "buku.dat";

    public static void simpanBuku(List<Buku> buku) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(FILE_BUKU))) {
            oos.writeObject(buku);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku");
        }
    }

    public static List<Buku> loadBuku() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(FILE_BUKU))) {
            return (List<Buku>) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
