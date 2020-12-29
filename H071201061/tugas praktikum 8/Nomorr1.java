import java.util.Scanner;
import java.io.*;
public class Nomorr1{
    public static void main(String [] args){
        Scanner inputt = new Scanner(System.in);
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        File cek = null;

        

        try {

            String namaFile = inputt.nextLine();
            String namaFileSalinan = inputt.nextLine();
            masukan = new FileInputStream(String.format("%s.txt" , namaFile));
            keluaran = new FileOutputStream(String.format("%s.txt", namaFileSalinan));
            cek = new File(String.format("%s.txt", namaFile));
            int readd;

            while((readd = masukan.read()) !=-1 ){
                keluaran.write(readd);
            }
            if (cek.exists()){
                System.out.println("Berhasil");
            }
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally{
            try {
                

                if (masukan != null){
                    masukan.close();
                }
                if (keluaran != null){
                    keluaran.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
        inputt.close();
    }
}