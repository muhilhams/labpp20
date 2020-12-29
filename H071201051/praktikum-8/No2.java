import java.util.*;
import java.io.*;

public class No2 {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner (System.in);
        FileReader fileRead = null;
        BufferedReader buffRead = null;
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

      try {
        String sourceFile = scan.next();                                            
        String CopiedFile = scan.next();                                           
        scan.close();
        fileRead = new FileReader(String.format("%s.txt", sourceFile));
        buffRead = new BufferedReader(fileRead);
        fileWrite = new FileWriter(String.format("%s.txt", CopiedFile));
        printWrite = new PrintWriter(fileWrite);
        String text;
        int max = 0;
        while ((text = buffRead.readLine()) != null){
            max = text.length() > max ? text.length() : max;
        }
        fileRead = new FileReader(String.format("%s.txt",sourceFile));
        buffRead = new BufferedReader(fileRead);
        
        String text2;
        while ((text2 = buffRead.readLine()) != null) {
            printWrite.write(String.format("%"+max+"s\n", text2));
        }
      } catch (IOException ioe){
        System.out.println("Gagal");
      } finally {
         try {
            if (fileWrite != null){
               System.out.println("Berhasil");
               fileWrite.close();
            } 
            if (fileRead != null){
               fileRead.close();
            }
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
            }
        }
    }
}   