import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TP801 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        System.out.println("Insert file name: ");
        String fileName = String.format("%s.txt", ax.nextLine());

        if (check(fileName) == false){
            System.out.println("Gagal");
            return;
        }
        bacatulis(fileName, ax);
        System.out.println("Berhasil");
        return;

        
    }

    public static boolean check(String name) {
        File file = null;
        boolean check = true;
        try {
            file = new File(name);
            if(file.exists() && file.isFile()){
                check = true;
            } else {
                check = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static void bacatulis(String name, Scanner ax) {
        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader bfRead = null;
        BufferedWriter bfWrite = null;
        try {
            reader = new FileReader(name);
            bfRead = new BufferedReader(reader);
            System.out.println("Insert file name: ");
            String fileName = String.format("%s.txt", ax.nextLine());
            writer = new FileWriter(fileName, true);
            bfWrite = new BufferedWriter(writer);
            String text = new String();
            while((text = bfRead.readLine()) != null) {
                bfWrite.write(text);
                bfWrite.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bfWrite != null) {
                    bfWrite.close();
                }
                if(bfRead != null) {
                    bfRead.close();
                }
                if(writer != null) {
                    writer.close();
                }
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}