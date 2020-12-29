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
        int batas = batas(namafile);
        gabungan(namafile, input, batas);
        System.out.println("Berhasil");
        return;
        
    }
    public static boolean cekfile(String nama) {
        File file = null;
        boolean cek = true;
        try {
            file = new File(nama);
            if(file.exists()){
                if(file.isFile()){
                    cek = true;
                }
                else{
                    cek = false;
                }
            }else{
                cek = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    public static void gabungan(String nama, Scanner input, int batas) {
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
                for(int i = 0; i< batas-tulisan.length();i++){
                    tulis.write(" ");
                }
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
    public static int batas(String nama) {
        int jumlah = 0;
        try (BufferedReader baca = new BufferedReader(new FileReader(nama))) {
            String batas = new String();
            while((batas = baca.readLine()) != null){
                if(batas.length() > jumlah){
                    jumlah = batas.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return jumlah;
    }
}
