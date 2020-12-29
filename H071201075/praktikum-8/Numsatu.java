import java.io.*;
import java.util.Scanner;

class Numsatu {
    public static void main(String[] args) {
        Scanner main = new Scanner (System.in);
        FileInputStream x = null;
        FileOutputStream y = null;
        
        
            try {
            x = new FileInputStream(main.next()+".txt");
            y = new FileOutputStream(main.next()+".txt");
            int yann;
            while ((yann = x.read()) != -1) {
                y.write(yann);
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        }

        finally {
            try {
                if (x != null) {
                    System.out.println("berhasil");
                    x.close();
                }
                if (y != null) {
                    y.close();
                }
            } catch (IOException ioe) {
                System.out.println("gagal");
            }
        }
    }
}