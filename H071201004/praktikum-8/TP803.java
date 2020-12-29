import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TP803 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Insert file name: ");
        String fileName = ax.nextLine();
        if(fileName.contains(" ")){
            fileName = fileName.replace(" ", "_");
        }
        fileName = String.format("%s.txt", fileName);
        System.out.println("Insert data: ");
        int data = ax.nextInt();
        if(data < 0){
            System.out.println("Gagal");
            return;
        }
        dataFile(data, fileName, ax);
        return;
    }

    public static String input(Scanner ax) {
        String tes = ax.nextLine();
        System.out.println("Insert data: ");
        String nama = ax.nextLine();
        String nim = ax.nextLine();
        String tahun = ax.nextLine();
        if(nama.length() > 20 || nim.length() > 10 || tahun.length() >  8){
            System.out.println("Gagal");
            return nama = " ";
        }
        String baris = "| " + nama;
        int panjang = nama.length();
        for(int i = 0; i < 20-panjang; i++){
            baris = baris + " ";
        }
        baris = baris + nim + " | " + tahun;
        panjang = tahun.length();
        for(int i = 0; i < 8; i++){
            baris = baris + " ";
        }
        baris = baris + " |";
        return baris;
    }

    public static void dataFile(int data, String fileName, Scanner input) {
        try (BufferedWriter tulis = new BufferedWriter(new FileWriter(fileName))){
            tulis.write("+----------------------+------------+----------+\n");
            tulis.write("| Nama                 | NIM        | Angkatan |\n");
            tulis.write("+----------------------+------------+----------+\n");
            String baris = "";
            if(data == 0){
                tulis.write("|                      |            |          |\n");
                tulis.write("+----------------------+------------+----------+\n");
                System.out.println("Berhasil");
                return;
            }
            for(int i = 0; i < data; i++){
                baris = input(input);
                if(baris.equals(" ")){
                    return;
                }
                tulis.write(baris);
                tulis.newLine();
            }
            tulis.write("+----------------------+------------+----------+\n");
            System.out.println("Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
