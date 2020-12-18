    import java.util.Scanner;
import java.io.*;

public class Numdua{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner main = new Scanner (System.in);
      FileReader fileRead = null;
      FileWriter fileWrite = null;
      PrintWriter printWrite = null;
      
      BufferedReader buffRead = null;

      try {
         String kosongsatu = main.next();                                            
         String kosongdua = main.next();  

         main.close();
         
         fileWrite = new FileWriter(String.format("%s.txt", kosongdua));
         printWrite = new PrintWriter(fileWrite);

         fileRead = new FileReader(String.format("%s.txt",kosongsatu));
         buffRead = new BufferedReader(fileRead);
         String yann;

         int x = 0;
         while ((yann = buffRead.readLine()) != null){
             if (yann.length() > x){
                x=yann.length();

             }else{
                x=x;
             }
          
         }
         fileRead = new FileReader(String.format("%s.txt",kosongsatu));
         buffRead = new BufferedReader(fileRead);


         String ilham;

         while ((ilham = buffRead.readLine()) != null) {
            printWrite.write(String.format("%"+ x +"s\n", ilham));
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

