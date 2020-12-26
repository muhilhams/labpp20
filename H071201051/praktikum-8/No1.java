import java.io.*;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileInputStream source = null;
        FileOutputStream copied = null;
        System.out.println("Input directory source, example: D:\\Tesjava\\");
        String from = scan.next();
        System.out.println("Input directory tujuan, example: D:\\Tesjava\\ or C:\\Tesjava\\");
        String to = scan.next();
        System.out.println("Masukkan nama file yang akan disalin:");
        String sourceFile = scan.next();
        System.out.println("Masukkan nama file hasil salinan:");
        String copiedFile = scan.next();
        try {
            source = new FileInputStream(from + sourceFile + ".txt");
            copied = new FileOutputStream(to + copiedFile + ".txt");
            // Atau hilangkan kode baris ke 8 sampai 15, dan pada baris 17 dan 18 ganti dengan kode dibawah ini:
            // source = new FileInputStream(scan.next()+".txt");
            // copied = new FileOutputStream(scan.next()+".txt");
            // Dengan menggunakan kode tersebut maka kita tidak perlu mengatur di direktori mana file yang akan di copy
            // karena file yang akan di copy ada di direktori dimana program ini dibuat
            int data;
            while ((data = source.read()) != -1) {
                copied.write(data);
            }
            System.out.println("Berhasil");
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (source != null) {
                    source.close();
                }
                if (copied != null) {
                    copied.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal");
            }
        }
    }
} 