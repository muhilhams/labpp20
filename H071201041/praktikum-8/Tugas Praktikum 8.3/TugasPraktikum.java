import java.util.Scanner;
import java.io.*;
public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama file yang dihasilkan");
        String namafile = input.nextLine();
        if(namafile.contains(" ")){
            namafile = namafile.replace(" ", "_");
        }
        namafile = String.format("%s.txt", namafile);
        System.out.println("Masukkan jumlah data yang ingin dimasukkan");
        int banyakdata = input.nextInt();
        if(banyakdata < 0){
            System.out.println("Gagal");
            return;
        }
        masukfile(banyakdata, namafile, input);
        return;
    }
    public static String input(Scanner input) {
        String tes = input.nextLine();
        System.out.println("Masukkan data");
        String nama = input.nextLine();
        String nim = input.next();
        String tahun = input.next();
        if(nama.length()>20 || nim.length()>10 || tahun.length()>8){
            System.out.println("Gagal");
            return nama = " ";
        }
        String baris = "| "+nama;
        int panjang = nama.length();
        for(int i = 0;i<20-panjang;i++){
            baris = baris+" ";
        }
        baris = baris+" | ";
        panjang = nim.length();
        for(int i = 0;i<10-panjang;i++){
            baris = baris+" ";
        }
        baris = baris+nim+" | "+tahun;
        panjang = tahun.length();
        for(int i = 0;i<8-panjang;i++){
            baris = baris+" ";
        }
        baris = baris+" |";
        return baris;
    }
    public static void masukfile(int banyakdata, String namafile, Scanner input) {
        try (BufferedWriter tulis = new BufferedWriter(new FileWriter(namafile))) {
            tulis.write("+----------------------+------------+----------+\n");
            tulis.write("| Nama                 | NIM        | Angkatan |\n");
            tulis.write("+----------------------+------------+----------+\n");
            String baris = "";
            if(banyakdata == 0){
                tulis.write("|                      |            |          |\n");
                tulis.write("+----------------------+------------+----------+");
                System.out.println("Berhasil");
                return;
            }
            for(int i = 0;i<banyakdata;i++){
                baris = input(input);
                if(baris.equals(" ")){
                    return;
                }
                tulis.write(baris);
                tulis.newLine();
            }
            tulis.write("+----------------------+------------+----------+");
            System.out.println("Berhasil");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
