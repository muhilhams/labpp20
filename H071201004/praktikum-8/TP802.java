import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TP802 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Insert file name: ");
        String fileName = String.format("%s.txt", ax.nextLine());
        if(check(fileName) == false){
            System.out.println("Gagal");
            return;
        }
        int limit = limit(fileName);
        bacatulis(fileName, ax, limit);
        System.out.println("Berhasil");
        return;
    }
    public static boolean check(String name) {
        File file = null;
        boolean check = true;
        try {
            file = new File(name);
            if(file.exists()){
                if(file.isFile()){
                    check = true;
                } else {
                    check = false;
                }
            } else {
                check = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static void bacatulis(String name, Scanner ax, int limit) {
        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader baca = null;
        BufferedWriter tulis = null;
        try {
            reader = new FileReader(name);
            baca = new BufferedReader(reader);
            System.out.println("Insert file name: ");
            String fileName = String.format("%s.txt", ax.nextLine());
            writer = new FileWriter(fileName, true);
            tulis = new BufferedWriter(writer);
            String text = new String();
            while((text = baca.readLine()) != null) {
                for(int i = 0; i < limit-text.length(); i++) {
                    tulis.write(" ");
                }
                tulis.write(text);
                tulis.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(tulis != null){
                    tulis.close();
                }
                if(baca != null){
                    baca.close();
                }
                if(writer != null){
                    writer.close();
                }
                if(reader != null){
                    reader.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }

    public static int limit(String name) {
        int jumlah = 0;
        try (BufferedReader baca = new BufferedReader(new FileReader(name))) {
            String limit = new String();
            while((limit = baca.readLine()) != null){
                if(limit.length() > jumlah){
                    jumlah = limit.length();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return jumlah;
    }
}
