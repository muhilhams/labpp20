import java.io.*;
import java.util.Scanner;
public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama file yang ingin dicopy");
        String namafile = String.format("%s.txt", input.nextLine());
        if(cekfile(namafile)==false){
            System.out.println("Gagal");
            return;
        }
        gabungan(namafile, input);
        System.out.println("Berhasil");
        return;
        
    }
    public static boolean cekfile(String nama) {
        File file = null;
        boolean cek = true;
        try {
            file = new File(nama);
            if(file.exists() && file.isFile()){
                cek = true;
            }else{
                cek = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    public static void gabungan(String nama, Scanner input) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader baca = null;
        BufferedWriter tulis = null;
        try {
            fileReader = new FileReader(nama);
            baca = new BufferedReader(fileReader);
            System.out.println("Masukkan nama file hasil copy");
            String namafile = String.format("%s.txt", input.nextLine());
            fileWriter = new FileWriter(namafile, true);
            tulis = new BufferedWriter(fileWriter);
            String tulisan = new String();
            while((tulisan = baca.readLine()) != null){
                tulis.write(tulisan);
                tulis.newLine();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(tulis != null){
                    tulis.close();
                }
                if(baca != null){
                    baca.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
                if(tulis != null){
                    fileReader.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
