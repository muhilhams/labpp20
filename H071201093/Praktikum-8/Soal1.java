import java.io.*;
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream(rhm.next() + ".txt");
            output = new FileOutputStream(rhm.next() + ".txt");
            int i;
            while((i = input.read()) != -1){
                output.write(i);
            }
        }catch(IOException ioe){
            System.out.println("gagal");
        }finally{
            try{
                if(input != null){
                    System.out.println("Berhasil");
                    input.close();
                }
                if(output != null){
                    output.close();                
                }
            }
            catch(IOException ioe){
                System.out.println("Gagal");
            }
        }
    }
}